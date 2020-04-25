package 设计模式.创建者.抽象创建者;

import java.util.ArrayList;
import java.util.List;

public class QueryEntity {

    private String dbName;
    private List<String> tableNames;
    private List<String> columnNames;
    private String whereCondition;
    private String havingCondition;

    public QueryEntity() {
        tableNames = new ArrayList<>();
        columnNames = new ArrayList<>();
    }

    public String getDbName() {
        return dbName;
    }

    public List<String> getTableNames() {
        return tableNames;
    }

    public List<String> getColumnNames() {
        return columnNames;
    }

    public String getWhereCondition() {
        return whereCondition;
    }

    public String getHavingCondition() {
        return havingCondition;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void addTableName(String tbName) {
        tableNames.add(tbName);
    }

    public void addColumnName(String colName) {
        columnNames.add(colName);
    }

    public void setWhereCondition(String whereCondition) {
        this.whereCondition = whereCondition;
    }

    public void setHavingCondition(String havingCondition) {
        this.havingCondition = havingCondition;
    }
}
