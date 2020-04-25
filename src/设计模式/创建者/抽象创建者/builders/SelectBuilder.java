package 设计模式.创建者.抽象创建者.builders;

import 设计模式.创建者.抽象创建者.QueryEntity;

public class SelectBuilder implements SQLBuilderInterface {

    private QueryEntity q;

    public SelectBuilder() {
        q = new QueryEntity();
    }

    @Override
    public void setDBName(String dbName) {
        q.setDbName(dbName);
    }

    @Override
    public void addTableName(String tableName) {
        q.addTableName(tableName);
    }

    @Override
    public void addColumnName(String colName) {
        q.addColumnName(colName);
    }

    @Override
    public void setWhereCondition(String whereCondition) {
        q.setWhereCondition(whereCondition);
    }

    @Override
    public void setHavingCondition(String havingCondition) {
        q.setHavingCondition(havingCondition);
    }

    @Override
    public String getStatement() {
        StringBuilder sb = new StringBuilder(String.format("USE %s; ", q.getDbName()));

        sb.append(String.format("SELECT %s FROM %s ", String.join(",", q.getColumnNames()), String.join(",", q.getTableNames())));

        sb.append(q.getWhereCondition() != null ? q.getWhereCondition() : "");
        sb.append(q.getHavingCondition() != null ? q.getHavingCondition() : "");

        return sb.toString();
    }
}
