package ai.turintech.catalog.service.dto;

import ai.turintech.catalog.domain.Model;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * A DTO for the {@link ai.turintech.catalog.domain.MlTaskType} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class MlTaskTypeDTO implements Serializable {

    private UUID id;

    @NotNull(message = "must not be null")
    private String name;

    private Set<Model> models = new HashSet<>();

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

    public Set<Model> getModels() {
        return models;
    }

    public void setModels(Set<Model> models) {
        this.models = models;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MlTaskTypeDTO)) {
            return false;
        }

        MlTaskTypeDTO mlTaskTypeDTO = (MlTaskTypeDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, mlTaskTypeDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "MlTaskTypeDTO{" +
            "id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", models=" + getModels() +
            "}";
    }
}
