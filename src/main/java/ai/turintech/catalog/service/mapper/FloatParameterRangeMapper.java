package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.FloatParameterRange;
import ai.turintech.catalog.service.dto.FloatParameterRangeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link FloatParameterRange} and its DTO {@link FloatParameterRangeDTO}.
 */
@Mapper(componentModel = "spring")
public interface FloatParameterRangeMapper extends EntityMapper<FloatParameterRangeDTO, FloatParameterRange> {}
