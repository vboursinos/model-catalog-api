package ai.turintech.catalog.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.relational.core.sql.Column;
import org.springframework.data.relational.core.sql.Expression;
import org.springframework.data.relational.core.sql.Table;

public class IntegerParameterValueSqlHelper {

    public static List<Expression> getColumns(Table table, String columnPrefix) {
        List<Expression> columns = new ArrayList<>();
        columns.add(Column.aliased("id", table, columnPrefix + "_id"));
        columns.add(Column.aliased("jhi_left", table, columnPrefix + "_jhi_left"));
        columns.add(Column.aliased("jhi_right", table, columnPrefix + "_jhi_right"));

        return columns;
    }
}
