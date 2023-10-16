package ai.turintech.catalog.service.mapper;

import ai.turintech.catalog.domain.MlTaskType;
import ai.turintech.catalog.domain.Model;
import ai.turintech.catalog.service.dto.MlTaskTypeDTO;
import ai.turintech.catalog.service.dto.ModelDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link MlTaskType} and its DTO {@link MlTaskTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface MlTaskTypeMapper extends EntityMapper<MlTaskTypeDTO, MlTaskType> {
    MlTaskTypeDTO toDto(MlTaskType s);

    @Named("modelId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    ModelDTO toDtoModelId(Model model);
}
