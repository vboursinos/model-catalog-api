package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.Model;
import ai.turintech.catalog.domain.ModelType;
import ai.turintech.catalog.service.dto.ModelDTO;
import ai.turintech.catalog.service.dto.ModelTypeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ModelType} and its DTO {@link ModelTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface ModelTypeMapper extends EntityMapper<ModelTypeDTO, ModelType> {
    ModelTypeDTO toDto(ModelType s);

    @Named("modelId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ModelDTO toDtoModelId(Model model);
}
