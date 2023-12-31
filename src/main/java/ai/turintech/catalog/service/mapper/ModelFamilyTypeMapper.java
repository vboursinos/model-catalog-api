package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.Model;
import ai.turintech.catalog.domain.ModelFamilyType;
import ai.turintech.catalog.service.dto.ModelDTO;
import ai.turintech.catalog.service.dto.ModelFamilyTypeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ModelFamilyType} and its DTO {@link ModelFamilyTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface ModelFamilyTypeMapper extends EntityMapper<ModelFamilyTypeDTO, ModelFamilyType> {
    @Mapping(target = "models", source = "models", qualifiedByName = "modelId")
    ModelFamilyTypeDTO toDto(ModelFamilyType s);

    @Named("modelId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ModelDTO toDtoModelId(Model model);
}
