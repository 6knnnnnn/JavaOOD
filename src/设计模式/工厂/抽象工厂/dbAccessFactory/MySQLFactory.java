package 设计模式.工厂.抽象工厂.dbAccessFactory;

import 设计模式.工厂.简单工厂.dbAccessObject.DB2DAO;
import 设计模式.工厂.简单工厂.dbAccessObject.InterfaceDAO;

public class MySQLFactory implements InterfaceDAOFactory {
    @Override
    public InterfaceDAO createDAOProduct() {
        return new DB2DAO();
    }
}
