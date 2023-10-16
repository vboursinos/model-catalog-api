package ai.turintech.catalog.repository.rowmapper;

import ai.turintech.catalog.domain.IntegerParameterValue;
import ai.turintech.catalog.domain.ParameterTypeDefinition;
import io.r2dbc.spi.Row;

import java.util.UUID;
import java.util.function.BiFunction;
import org.springframework.stereotype.Service;

/**
 * Converter between {@link Row} to {@link IntegerParameterValue}, with proper type conversions.
 */
@Service
public class IntegerParameterValueRowMapper implements BiFunction<Row, String, IntegerParameterValue> {

    private final ColumnConverter converter;

    public IntegerParameterValueRowMapper(ColumnConverter converter) {
        this.converter = converter;
    }

    /**
     * Take a {@link Row} and a column prefix, and extract all the fields.
     * @return the {@link IntegerParameterValue} stored in the database.
     */
    @Override
    public IntegerParameterValue apply(Row row, String prefix) {
        IntegerParameterValue entity = new IntegerParameterValue();
        entity.setId(converter.fromRow(row, prefix + "_id", UUID.class));
        entity.setParameterTypeDefinition(converter.fromRow(row, prefix + "_parameter_type_definition_id", ParameterTypeDefinition.class));
        entity.setLeft(converter.fromRow(row, prefix + "_jhi_left", Integer.class));
        entity.setRight(converter.fromRow(row, prefix + "_jhi_right", Integer.class));
        return entity;
    }
}
