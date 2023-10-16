package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.CategoricalParameter;
import ai.turintech.catalog.service.dto.CategoricalParameterDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link CategoricalParameter} and its DTO {@link CategoricalParameterDTO}.
 */
@Mapper(componentModel = "spring")
public interface CategoricalParameterMapper extends EntityMapper<CategoricalParameterDTO, CategoricalParameter> {}
