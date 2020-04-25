package 设计模式.工厂.抽象工厂.dbAccessFactory;

import 设计模式.工厂.简单工厂.dbAccessObject.InterfaceDAO;
import 设计模式.工厂.简单工厂.dbAccessObject.OracleDAO;

public class OracleFactory implements InterfaceDAOFactory {
    @Override
    public InterfaceDAO createDAOProduct() {
        return new OracleDAO();
    }
}
