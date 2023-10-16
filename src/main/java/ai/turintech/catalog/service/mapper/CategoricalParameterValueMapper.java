package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.CategoricalParameterValue;
import ai.turintech.catalog.service.dto.CategoricalParameterValueDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link CategoricalParameterValue} and its DTO {@link CategoricalParameterValueDTO}.
 */
@Mapper(componentModel = "spring")
public interface CategoricalParameterValueMapper extends EntityMapper<CategoricalParameterValueDTO, CategoricalParameterValue> {}
