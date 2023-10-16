package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.Model;
import ai.turintech.catalog.domain.ModelEnsembleType;
import ai.turintech.catalog.service.dto.ModelDTO;
import ai.turintech.catalog.service.dto.ModelEnsembleTypeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ModelEnsembleType} and its DTO {@link ModelEnsembleTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface ModelEnsembleTypeMapper extends EntityMapper<ModelEnsembleTypeDTO, ModelEnsembleType> {
    @Mapping(target = "models", source = "models", qualifiedByName = "modelId")
    ModelEnsembleTypeDTO toDto(ModelEnsembleType s);

    @Named("modelId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ModelDTO toDtoModelId(Model model);
}
