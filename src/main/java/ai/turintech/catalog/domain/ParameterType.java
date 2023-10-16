package ai.turintech.catalog.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * A ParameterType.
 */
@Table("parameter_type")
@JsonIgnoreProperties(value = { "new" })
@SuppressWarnings("common-java:DuplicatedBlocks")
public class ParameterType implements Serializable, Persistable<UUID> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column("id")
    private UUID id;

    @NotNull(message = "must not be null")
    @Column("name")
    private String name;

    @Transient
    private boolean isPersisted;

    @Transient
    @JsonIgnoreProperties(value = { "models", "types", "distributions", "definitions" }, allowSetters = true)
    private Parameter parameter;

    @Transient
    @JsonIgnoreProperties(value = { "parameters", "types" }, allowSetters = true)
    private ParameterTypeDefinition parameterTypeDefinition;

    @Column("parameter_id")
    private UUID parameterId;

    @Column("parameter_type_definition_id")
    private UUID parameterTypeDefinitionId;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public UUID getId() {
        return this.id;
    }

    public ParameterType id(UUID id) {
        this.setId(id);
        return this;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public ParameterType name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Transient
    @Override
    public boolean isNew() {
        return !this.isPersisted;
    }

    public ParameterType setIsPersisted() {
        this.isPersisted = true;
        return this;
    }

    public Parameter getParameter() {
        return this.parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
        this.parameterId = parameter != null ? parameter.getId() : null;
    }

    public ParameterType parameter(Parameter parameter) {
        this.setParameter(parameter);
        return this;
    }

    public ParameterTypeDefinition getParameterTypeDefinition() {
        return this.parameterTypeDefinition;
    }

    public void setParameterTypeDefinition(ParameterTypeDefinition parameterTypeDefinition) {
        this.parameterTypeDefinition = parameterTypeDefinition;
        this.parameterTypeDefinitionId = parameterTypeDefinition != null ? parameterTypeDefinition.getId() : null;
    }

    public ParameterType parameterTypeDefinition(ParameterTypeDefinition parameterTypeDefinition) {
        this.setParameterTypeDefinition(parameterTypeDefinition);
        return this;
    }

    public UUID getParameterId() {
        return this.parameterId;
    }

    public void setParameterId(UUID parameter) {
        this.parameterId = parameter;
    }

    public UUID getParameterTypeDefinitionId() {
        return this.parameterTypeDefinitionId;
    }

    public void setParameterTypeDefinitionId(UUID parameterTypeDefinition) {
        this.parameterTypeDefinitionId = parameterTypeDefinition;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParameterType)) {
            return false;
        }
        return id != null && id.equals(((ParameterType) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ParameterType{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            "}";
    }
}
