package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.Parameter;
import ai.turintech.catalog.domain.ParameterType;
import ai.turintech.catalog.domain.ParameterTypeDefinition;
import ai.turintech.catalog.service.dto.ParameterDTO;
import ai.turintech.catalog.service.dto.ParameterTypeDTO;
import ai.turintech.catalog.service.dto.ParameterTypeDefinitionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ParameterType} and its DTO {@link ParameterTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface ParameterTypeMapper extends EntityMapper<ParameterTypeDTO, ParameterType> {
    @Mapping(target = "parameter", source = "parameter", qualifiedByName = "parameterId")
    @Mapping(target = "parameterTypeDefinition", source = "parameterTypeDefinition", qualifiedByName = "parameterTypeDefinitionId")
    ParameterTypeDTO toDto(ParameterType s);

    @Named("parameterId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ParameterDTO toDtoParameterId(Parameter parameter);

    @Named("parameterTypeDefinitionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ParameterTypeDefinitionDTO toDtoParameterTypeDefinitionId(ParameterTypeDefinition parameterTypeDefinition);
}
