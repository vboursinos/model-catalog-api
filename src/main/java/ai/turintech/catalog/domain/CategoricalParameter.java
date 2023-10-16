package ai.turintech.catalog.domain;

import java.io.Serializable;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * A CategoricalParameter.
 */
@Table("categorical_parameter")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class CategoricalParameter implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @Column("id")
//    private UUID id;

    @Id
    @NotNull(message = "must not be null")
    @Column("parameter_type_definition_id")
    private ParameterTypeDefinition parameterTypeDefinition;


    @Column("default_value")
    private String defaultValue;

    // jhipster-needle-entity-add-field - JHipster will add fields here


    public String getDefaultValue() {
        return this.defaultValue;
    }


    public CategoricalParameter defaultValue(String defaultValue) {
        this.setDefaultValue(defaultValue);
        return this;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public ParameterTypeDefinition getParameterTypeDefinition() {
        return parameterTypeDefinition;
    }

    public void setParameterTypeDefinition(ParameterTypeDefinition parameterTypeDefinition) {
        this.parameterTypeDefinition = parameterTypeDefinition;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here


    @Override
    public String toString() {
        return "CategoricalParameter{" +
                "parameterTypeDefinition=" + parameterTypeDefinition +
                ", defaultValue='" + defaultValue + '\'' +
                '}';
    }
}
