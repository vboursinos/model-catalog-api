package ai.turintech.catalog.repository.rowmapper;

import ai.turintech.catalog.domain.Parameter;
import ai.turintech.catalog.domain.ParameterDistributionType;
import ai.turintech.catalog.domain.ParameterType;
import ai.turintech.catalog.domain.ParameterTypeDefinition;
import io.r2dbc.spi.Row;
import java.util.UUID;
import java.util.function.BiFunction;
import org.springframework.stereotype.Service;

/**
 * Converter between {@link Row} to {@link ParameterTypeDefinition}, with proper type conversions.
 */
@Service
public class ParameterTypeDefinitionRowMapper implements BiFunction<Row, String, ParameterTypeDefinition> {

    private final ColumnConverter converter;

    public ParameterTypeDefinitionRowMapper(ColumnConverter converter) {
        this.converter = converter;
    }

    /**
     * Take a {@link Row} and a column prefix, and extract all the fields.
     * @return the {@link ParameterTypeDefinition} stored in the database.
     */
    @Override
    public ParameterTypeDefinition apply(Row row, String prefix) {
        ParameterTypeDefinition entity = new ParameterTypeDefinition();
        entity.setId(converter.fromRow(row, prefix + "_id", UUID.class));
        entity.setOrdering(converter.fromRow(row, prefix + "_ordering", Integer.class));
        entity.setParameterType(converter.fromRow(row, prefix + "_parameter_type_id", ParameterType.class));
        entity.setParameter(converter.fromRow(row, prefix + "_parameter_id", Parameter.class));
        entity.setParameterDistributionType(converter.fromRow(row, prefix + "_parameter_distribution_type_id", ParameterDistributionType.class));
        return entity;
    }
}
