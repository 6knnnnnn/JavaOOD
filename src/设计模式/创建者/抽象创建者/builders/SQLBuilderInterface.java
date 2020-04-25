package 设计模式.创建者.抽象创建者.builders;

public interface SQLBuilderInterface {

    public abstract void setDBName(String dbName);
    public abstract void addTableName(String tbName);
    public abstract void addColumnName(String colName);
    public abstract void setWhereCondition(String whereCondition);
    public abstract void setHavingCondition(String havingCondition);
    public abstract String getStatement();
}
