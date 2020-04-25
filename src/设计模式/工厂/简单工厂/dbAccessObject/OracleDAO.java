package 设计模式.工厂.简单工厂.dbAccessObject;

import 设计模式.工厂.entity.DBRequest;
import 设计模式.工厂.entity.DBResponse;

public class OracleDAO implements InterfaceDAO {
    @Override
    public DBResponse queryDB(DBRequest request) {
        return new DBResponse();
    }

    @Override
    public DBResponse deleteDB(DBRequest request) {
        return new DBResponse();
    }

    @Override
    public DBResponse insertDB(DBRequest request) {
        return new DBResponse();
    }

    @Override
    public DBResponse updateB(DBRequest request) {
        return new DBResponse();
    }
}
