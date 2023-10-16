package ai.turintech.catalog.domain;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * A IntegerParameterValue.
 */
@Table("integer_parameter_value")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class IntegerParameterValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column("id")
    private UUID id;

    @NotNull(message = "must not be null")
    @Column("left")
    private Integer left;

    @NotNull(message = "must not be null")
    @Column("right")
    private Integer right;

    @NotNull(message = "must not be null")
    @Column("parameter_type_definition_id")
    private ParameterTypeDefinition parameterTypeDefinition;

    // jhipster-needle-entity-add-field - JHipster will add fields here


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public IntegerParameterValue id(UUID id) {
        this.setId(id);
        return this;
    }
    public Integer getLeft() {
        return this.left;
    }

    public IntegerParameterValue left(Integer left) {
        this.setLeft(left);
        return this;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getRight() {
        return this.right;
    }

    public IntegerParameterValue right(Integer right) {
        this.setRight(right);
        return this;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    public ParameterTypeDefinition getParameterTypeDefinition() {
        return parameterTypeDefinition;
    }

    public void setParameterTypeDefinition(ParameterTypeDefinition parameterTypeDefinition) {
        this.parameterTypeDefinition = parameterTypeDefinition;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IntegerParameterValue)) {
            return false;
        }
        return id != null && id.equals(((IntegerParameterValue) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "IntegerParameterValue{" +
            "id=" + getId() +
            ", left=" + getLeft() +
            ", right=" + getRight() +
            "}";
    }
}
