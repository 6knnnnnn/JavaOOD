package 设计模式.工厂.抽象工厂.dbAccessObject;

import 设计模式.工厂.entity.DBRequest;
import 设计模式.工厂.entity.DBResponse;

public interface InterfaceDAO {

    public DBResponse queryDB(DBRequest request);

    public DBResponse deleteDB(DBRequest request);

    public DBResponse insertDB(DBRequest request);

    public DBResponse updateB(DBRequest request);
}
