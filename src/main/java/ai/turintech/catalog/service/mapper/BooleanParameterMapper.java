package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.BooleanParameter;
import ai.turintech.catalog.service.dto.BooleanParameterDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link BooleanParameter} and its DTO {@link BooleanParameterDTO}.
 */
@Mapper(componentModel = "spring")
public interface BooleanParameterMapper extends EntityMapper<BooleanParameterDTO, BooleanParameter> {}
