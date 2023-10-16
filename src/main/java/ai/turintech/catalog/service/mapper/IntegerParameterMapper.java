package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.IntegerParameter;
import ai.turintech.catalog.service.dto.IntegerParameterDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link IntegerParameter} and its DTO {@link IntegerParameterDTO}.
 */
@Mapper(componentModel = "spring")
public interface IntegerParameterMapper extends EntityMapper<IntegerParameterDTO, IntegerParameter> {}
