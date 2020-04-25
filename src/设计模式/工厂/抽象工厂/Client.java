package 设计模式.工厂.抽象工厂;

import 设计模式.工厂.entity.DBRequest;
import 设计模式.工厂.抽象工厂.dbAccessFactory.InterfaceDAOFactory;
import 设计模式.工厂.抽象工厂.dbAccessFactory.OracleFactory;
import 设计模式.工厂.简单工厂.dbAccessObject.InterfaceDAO;

public class Client {

    private static void case1() {
        DBRequest request = new DBRequest();

        // 仍旧需要在客户端创建具体的factory
        InterfaceDAOFactory factory = new OracleFactory();
        InterfaceDAO dao = factory.createDAOProduct();

        dao.insertDB(request);
    }

    public static void main(String[] args) {
        case1();
    }
}
