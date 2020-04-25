package 设计模式.工厂.抽象工厂.dbAccessFactory;

import 设计模式.工厂.简单工厂.dbAccessObject.InterfaceDAO;

public interface InterfaceDAOFactory {
    public InterfaceDAO createDAOProduct();
}
