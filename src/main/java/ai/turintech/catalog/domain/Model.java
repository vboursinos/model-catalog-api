package ai.turintech.catalog.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * A Model.
 */
@Table("model")
@JsonIgnoreProperties(value = { "new" })
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Model implements Serializable, Persistable<UUID> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column("id")
    private UUID id;

    @NotNull(message = "must not be null")
    @Column("name")
    private String name;

    @NotNull(message = "must not be null")
    @Column("display_name")
    private String displayName;

    @Column("description")
    private String description;

    @Column("advantages")
    private String advantages;

    @Column("disadvantages")
    private String disadvantages;

    @NotNull(message = "must not be null")
    @Column("enabled")
    private Boolean enabled;

    @NotNull(message = "must not be null")
    @Column("decision_tree")
    private Boolean decisionTree;

    @Transient
    private boolean isPersisted;

    @NotNull(message = "must not be null")
    @Column("ml_task_id")
    private MlTaskType mlTask;

    @NotNull(message = "must not be null")
    @Column("structure_id")
    private ModelStructureType structure;

    @NotNull(message = "must not be null")
    @Column("model_type_id")
    private ModelType modelType;

    @NotNull(message = "must not be null")
    @Column("family_type_id")
    private ModelFamilyType familyType;

    @NotNull(message = "must not be null")
    @Column("ensemble_type_id")
    private ModelEnsembleType ensembleType;

    @Transient
    private Set<ModelGroupType> groups = new HashSet<>();

    @Transient
    private Set<Metric> incompatibleMetrics = new HashSet<>();

    @Transient
    private Set<Parameter> parameters;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public UUID getId() {
        return this.id;
    }

    public Model id(UUID id) {
        this.setId(id);
        return this;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public Model name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public Model displayName(String displayName) {
        this.setDisplayName(displayName);
        return this;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return this.description;
    }

    public Model description(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdvantages() {
        return this.advantages;
    }

    public Model advantages(String advantages) {
        this.setAdvantages(advantages);
        return this;
    }

    public void setAdvantages(String advantages) {
        this.advantages = advantages;
    }

    public String getDisadvantages() {
        return this.disadvantages;
    }

    public Model disadvantages(String disadvantages) {
        this.setDisadvantages(disadvantages);
        return this;
    }

    public void setDisadvantages(String disadvantages) {
        this.disadvantages = disadvantages;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Model enabled(Boolean enabled) {
        this.setEnabled(enabled);
        return this;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getDecisionTree() {
        return this.decisionTree;
    }

    public Model decisionTree(Boolean decisionTree) {
        this.setDecisionTree(decisionTree);
        return this;
    }

    public void setDecisionTree(Boolean decisionTree) {
        this.decisionTree = decisionTree;
    }

    @Transient
    @Override
    public boolean isNew() {
        return !this.isPersisted;
    }

    public Model setIsPersisted() {
        this.isPersisted = true;
        return this;
    }


    public Set<ModelGroupType> getGroups() {
        return this.groups;
    }

    public void setGroups(Set<ModelGroupType> modelGroupTypes) {
        this.groups = modelGroupTypes;
    }

    public Model groups(Set<ModelGroupType> modelGroupTypes) {
        this.setGroups(modelGroupTypes);
        return this;
    }

    public Model addGroups(ModelGroupType modelGroupType) {
        this.groups.add(modelGroupType);
        modelGroupType.getModels().add(this);
        return this;
    }

    public Model removeGroups(ModelGroupType modelGroupType) {
        this.groups.remove(modelGroupType);
        modelGroupType.getModels().remove(this);
        return this;
    }

    public Set<Metric> getIncompatibleMetrics() {
        return this.incompatibleMetrics;
    }

    public void setIncompatibleMetrics(Set<Metric> metrics) {
        this.incompatibleMetrics = metrics;
    }

    public Model incompatibleMetrics(Set<Metric> metrics) {
        this.setIncompatibleMetrics(metrics);
        return this;
    }

    public Model addIncompatibleMetrics(Metric metric) {
        this.incompatibleMetrics.add(metric);
        metric.getModels().add(this);
        return this;
    }

    public Model removeIncompatibleMetrics(Metric metric) {
        this.incompatibleMetrics.remove(metric);
        metric.getModels().remove(this);
        return this;
    }

    public boolean isPersisted() {
        return isPersisted;
    }

    public void setPersisted(boolean persisted) {
        isPersisted = persisted;
    }

    public MlTaskType getMlTask() {
        return mlTask;
    }

    public void setMlTask(MlTaskType mlTask) {
        this.mlTask = mlTask;
    }

    public ModelStructureType getStructure() {
        return structure;
    }

    public void setStructure(ModelStructureType structure) {
        this.structure = structure;
    }

    public ModelType getModelType() {
        return modelType;
    }

    public void setModelType(ModelType modelType) {
        this.modelType = modelType;
    }

    public ModelFamilyType getFamilyType() {
        return familyType;
    }

    public void setFamilyType(ModelFamilyType familyType) {
        this.familyType = familyType;
    }

    public ModelEnsembleType getEnsembleType() {
        return ensembleType;
    }

    public void setEnsembleType(ModelEnsembleType ensembleType) {
        this.ensembleType = ensembleType;
    }

    public Set<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(Set<Parameter> parameters) {
        this.parameters = parameters;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Model)) {
            return false;
        }
        return id != null && id.equals(((Model) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Model{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", displayName='" + getDisplayName() + "'" +
            ", description='" + getDescription() + "'" +
            ", advantages='" + getAdvantages() + "'" +
            ", disadvantages='" + getDisadvantages() + "'" +
            ", enabled='" + getEnabled() + "'" +
            ", decisionTree='" + getDecisionTree() + "'" +
            "}";
    }
}
