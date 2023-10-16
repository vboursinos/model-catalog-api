package ai.turintech.catalog.domain;

import java.io.Serializable;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * A IntegerParameter.
 */
@Table("integer_parameter")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class IntegerParameter implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @Column("id")
//    private UUID id;

    @Id
    @NotNull(message = "must not be null")
    @Column("parameter_type_definition_id")
    private ParameterTypeDefinition parameterTypeDefinition;

    @Column("default_value")
    private Integer defaultValue;

    // jhipster-needle-entity-add-field - JHipster will add fields here


    public Integer getDefaultValue() {
        return this.defaultValue;
    }

    public IntegerParameter defaultValue(Integer defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    public void setDefaultValue(Integer defaultValue) {
        this.defaultValue = defaultValue;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here


    public ParameterTypeDefinition getParameterTypeDefinition() {
        return parameterTypeDefinition;
    }

    public void setParameterTypeDefinition(ParameterTypeDefinition parameterTypeDefinition) {
        this.parameterTypeDefinition = parameterTypeDefinition;
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "IntegerParameter{" +
                "parameterTypeDefinition=" + parameterTypeDefinition +
                ", defaultValue=" + defaultValue +
                '}';
    }
}
