package 设计模式.创建者.构造函数参数过多;

import java.util.ArrayList;
import java.util.List;

public class Query {

    private String dbName;
    private List<String> tableNames;
    private List<String> columnNames;
    private String whereCondition;
    private String havingCondition;

//    public void setDbName(String dbName) {
//        this.dbName = dbName;
//    }
//
//    public void setTableNames(List<String> tableNames) {
//        this.tableNames = tableNames;
//    }
//
//    public void setColumnNames(List<String> columnNames) {
//        this.columnNames = columnNames;
//    }
//
//    public void setWhereCondition(String whereCondition) {
//        this.whereCondition = whereCondition;
//    }
//
//    public void setHavingCondition(String havingCondition) {
//        this.havingCondition = havingCondition;
//    }
//
//    SimpleQuery() {}

    private Query(QueryBuilder builder) {
        // constructor is private so only the builder can call it
        dbName = builder.dbName;
        tableNames = builder.tableNames;
        columnNames = builder.columnNames;
        whereCondition = builder.whereCondition;
        havingCondition = builder.havingCondition;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(String.format("USE %s; ", dbName));

        sb.append(String.format("SELECT %s FROM %s", String.join(",", columnNames), String.join(",", tableNames)));
        sb.append(whereCondition != null ? String.format(" WHERE %s", whereCondition) : "");
        sb.append(havingCondition != null ? String.format(" HAVING %s", havingCondition) : "");

        return sb.toString();
    }

    public static class QueryBuilder {
        private String dbName;
        private List<String> tableNames;
        private List<String> columnNames;
        private String whereCondition;
        private String havingCondition;

        QueryBuilder() {
            tableNames = new ArrayList<>();
            columnNames = new ArrayList<>();
        }

        public Query build() {
            return new Query(this);
        }

        public QueryBuilder setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        public QueryBuilder addTableName(String tbName) {
            tableNames.add(tbName);
            return this;
        }

        public QueryBuilder addColumnName(String colName) {
            columnNames.add(colName);
            return this;
        }

        public QueryBuilder setWhereCondition(String whereCondition) {
            this.whereCondition = whereCondition;
            return this;
        }

        public QueryBuilder setHavingCondition(String havingCondition) {
            this.havingCondition = havingCondition;
            return this;
        }
    }
}
