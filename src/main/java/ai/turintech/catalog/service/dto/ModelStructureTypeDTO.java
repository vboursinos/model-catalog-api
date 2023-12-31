package ai.turintech.catalog.service.dto;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * A DTO for the {@link ai.turintech.catalog.domain.ModelStructureType} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ModelStructureTypeDTO implements Serializable {

    private UUID id;

    @NotNull(message = "must not be null")
    private String name;

    private ModelDTO model;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelDTO getModel() {
        return model;
    }

    public void setModel(ModelDTO model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelStructureTypeDTO)) {
            return false;
        }

        ModelStructureTypeDTO modelStructureTypeDTO = (ModelStructureTypeDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, modelStructureTypeDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ModelStructureTypeDTO{" +
            "id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", model=" + getModel() +
            "}";
    }
}
