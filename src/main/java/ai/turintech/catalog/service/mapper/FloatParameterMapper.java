package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.FloatParameter;
import ai.turintech.catalog.service.dto.FloatParameterDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link FloatParameter} and its DTO {@link FloatParameterDTO}.
 */
@Mapper(componentModel = "spring")
public interface FloatParameterMapper extends EntityMapper<FloatParameterDTO, FloatParameter> {}
