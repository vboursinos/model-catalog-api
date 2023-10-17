package ai.turintech.catalog.domain;

import static org.assertj.core.api.Assertions.assertThat;

import ai.turintech.catalog.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class IntegerParameterValueTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(IntegerParameterValue.class);
        IntegerParameterValue integerParameterValue1 = new IntegerParameterValue();
        integerParameterValue1.setId(UUID.fromString("id1"));
        IntegerParameterValue integerParameterValue2 = new IntegerParameterValue();
        integerParameterValue2.setId(integerParameterValue1.getId());
        assertThat(integerParameterValue1).isEqualTo(integerParameterValue2);
        integerParameterValue2.setId(UUID.fromString("2L"));
        assertThat(integerParameterValue1).isNotEqualTo(integerParameterValue2);
        integerParameterValue1.setId(null);
        assertThat(integerParameterValue1).isNotEqualTo(integerParameterValue2);
    }
}
