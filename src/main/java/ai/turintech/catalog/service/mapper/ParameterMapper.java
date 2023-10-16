package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.Parameter;
import ai.turintech.catalog.domain.ParameterTypeDefinition;
import ai.turintech.catalog.service.dto.ParameterDTO;
import ai.turintech.catalog.service.dto.ParameterTypeDefinitionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Parameter} and its DTO {@link ParameterDTO}.
 */
@Mapper(componentModel = "spring")
public interface ParameterMapper extends EntityMapper<ParameterDTO, Parameter> {
    @Mapping(target = "definitions", source = "definitions", qualifiedByName = "parameterTypeDefinitionId")
    ParameterDTO toDto(Parameter s);

    @Named("parameterTypeDefinitionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ParameterTypeDefinitionDTO toDtoParameterTypeDefinitionId(ParameterTypeDefinition parameterTypeDefinition);
}
