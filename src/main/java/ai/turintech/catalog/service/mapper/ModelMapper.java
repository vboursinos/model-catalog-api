package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.Metric;
import ai.turintech.catalog.domain.Model;
import ai.turintech.catalog.domain.ModelGroupType;
import ai.turintech.catalog.domain.Parameter;
import ai.turintech.catalog.service.dto.MetricDTO;
import ai.turintech.catalog.service.dto.ModelDTO;
import ai.turintech.catalog.service.dto.ModelGroupTypeDTO;
import ai.turintech.catalog.service.dto.ParameterDTO;
import java.util.Set;
import java.util.stream.Collectors;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Model} and its DTO {@link ModelDTO}.
 */
@Mapper(componentModel = "spring")
public interface ModelMapper extends EntityMapper<ModelDTO, Model> {
    @Mapping(target = "groups", source = "groups", qualifiedByName = "modelGroupTypeIdSet")
    @Mapping(target = "incompatibleMetrics", source = "incompatibleMetrics", qualifiedByName = "metricIdSet")
    @Mapping(target = "parameters", source = "parameters", qualifiedByName = "parameterId")
    ModelDTO toDto(Model s);

    @Mapping(target = "removeGroups", ignore = true)
    @Mapping(target = "removeIncompatibleMetrics", ignore = true)
    Model toEntity(ModelDTO modelDTO);

    @Named("modelGroupTypeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ModelGroupTypeDTO toDtoModelGroupTypeId(ModelGroupType modelGroupType);

    @Named("modelGroupTypeIdSet")
    default Set<ModelGroupTypeDTO> toDtoModelGroupTypeIdSet(Set<ModelGroupType> modelGroupType) {
        return modelGroupType.stream().map(this::toDtoModelGroupTypeId).collect(Collectors.toSet());
    }

    @Named("metricId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    MetricDTO toDtoMetricId(Metric metric);

    @Named("metricIdSet")
    default Set<MetricDTO> toDtoMetricIdSet(Set<Metric> metric) {
        return metric.stream().map(this::toDtoMetricId).collect(Collectors.toSet());
    }

    @Named("parameterId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ParameterDTO toDtoParameterId(Parameter parameter);
}
