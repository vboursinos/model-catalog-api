package ai.turintech.catalog.domain;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/**
 * A FloatParameterRange.
 */
@Table("float_parameter_range")
@SuppressWarnings("common-java:DuplicatedBlocks")
public class FloatParameterRange implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column("id")
    private Long id;

    @NotNull(message = "must not be null")
    @Column("is_left_open")
    private Boolean isLeftOpen;

    @NotNull(message = "must not be null")
    @Column("is_right_open")
    private Boolean isRightOpen;

    @NotNull(message = "must not be null")
    @Column("jhi_left")
    private Integer left;

    @NotNull(message = "must not be null")
    @Column("jhi_right")
    private Integer right;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public FloatParameterRange id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsLeftOpen() {
        return this.isLeftOpen;
    }

    public FloatParameterRange isLeftOpen(Boolean isLeftOpen) {
        this.setIsLeftOpen(isLeftOpen);
        return this;
    }

    public void setIsLeftOpen(Boolean isLeftOpen) {
        this.isLeftOpen = isLeftOpen;
    }

    public Boolean getIsRightOpen() {
        return this.isRightOpen;
    }

    public FloatParameterRange isRightOpen(Boolean isRightOpen) {
        this.setIsRightOpen(isRightOpen);
        return this;
    }

    public void setIsRightOpen(Boolean isRightOpen) {
        this.isRightOpen = isRightOpen;
    }

    public Integer getLeft() {
        return this.left;
    }

    public FloatParameterRange left(Integer left) {
        this.setLeft(left);
        return this;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Integer getRight() {
        return this.right;
    }

    public FloatParameterRange right(Integer right) {
        this.setRight(right);
        return this;
    }

    public void setRight(Integer right) {
        this.right = right;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FloatParameterRange)) {
            return false;
        }
        return id != null && id.equals(((FloatParameterRange) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "FloatParameterRange{" +
            "id=" + getId() +
            ", isLeftOpen='" + getIsLeftOpen() + "'" +
            ", isRightOpen='" + getIsRightOpen() + "'" +
            ", left=" + getLeft() +
            ", right=" + getRight() +
            "}";
    }
}
