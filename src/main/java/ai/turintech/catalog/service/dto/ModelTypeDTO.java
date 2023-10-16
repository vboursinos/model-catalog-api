package ai.turintech.catalog.service.dto;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * A DTO for the {@link ai.turintech.catalog.domain.ModelType} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ModelTypeDTO implements Serializable {

    private UUID id;

    @NotNull(message = "must not be null")
    private String name;

    private ModelDTO models;

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

    public ModelDTO getModels() {
        return models;
    }

    public void setModels(ModelDTO models) {
        this.models = models;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelTypeDTO)) {
            return false;
        }

        ModelTypeDTO modelTypeDTO = (ModelTypeDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, modelTypeDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ModelTypeDTO{" +
            "id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", models=" + getModels() +
            "}";
    }
}
