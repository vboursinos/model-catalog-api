package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.ParameterTypeDefinition;
import ai.turintech.catalog.service.dto.ParameterTypeDefinitionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ParameterTypeDefinition} and its DTO {@link ParameterTypeDefinitionDTO}.
 */
@Mapper(componentModel = "spring")
public interface ParameterTypeDefinitionMapper extends EntityMapper<ParameterTypeDefinitionDTO, ParameterTypeDefinition> {}
