package ai.turintech.catalog.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * A FloatParameter.
 */
@Table("float_parameter")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class FloatParameter implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @Column("id")
//    private UUID id;

    @Id
    @NotNull(message = "must not be null")
    @Column("parameter_type_definition_id")
    private ParameterTypeDefinition parameterTypeDefinition;

    @Column("default_value")
    private Float defaultValue;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public ParameterTypeDefinition getParameterTypeDefinition() {
        return parameterTypeDefinition;
    }

    public void setParameterTypeDefinition(ParameterTypeDefinition parameterTypeDefinition) {
        this.parameterTypeDefinition = parameterTypeDefinition;
    }

    public Float getDefaultValue() {
        return this.defaultValue;
    }

    public FloatParameter defaultValue(Float defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    public void setDefaultValue(Float defaultValue) {
        this.defaultValue = defaultValue;
    }


    // prettier-ignore

    @Override
    public String toString() {
        return "FloatParameter{" +
                "parameterTypeDefinition=" + parameterTypeDefinition +
                ", defaultValue=" + defaultValue +
                '}';
    }
}
