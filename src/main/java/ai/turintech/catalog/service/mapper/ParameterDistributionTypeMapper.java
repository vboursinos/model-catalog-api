package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.Parameter;
import ai.turintech.catalog.domain.ParameterDistributionType;
import ai.turintech.catalog.service.dto.ParameterDTO;
import ai.turintech.catalog.service.dto.ParameterDistributionTypeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ParameterDistributionType} and its DTO {@link ParameterDistributionTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface ParameterDistributionTypeMapper extends EntityMapper<ParameterDistributionTypeDTO, ParameterDistributionType> {
    ParameterDistributionTypeDTO toDto(ParameterDistributionType s);

    @Named("parameterId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ParameterDTO toDtoParameterId(Parameter parameter);
}
