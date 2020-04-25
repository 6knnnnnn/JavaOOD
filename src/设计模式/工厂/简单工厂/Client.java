package 设计模式.工厂.简单工厂;

import 设计模式.工厂.entity.DBRequest;
import 设计模式.工厂.entity.DBResponse;
import 设计模式.工厂.简单工厂.dbAccessObject.InterfaceDAO;

public class Client {

    private static void case1() {
        DBRequest request = new DBRequest();

        String dbName = "db2";

        InterfaceDAO dao = DAOFactory.createDAO(dbName);

        DBResponse response = dao.queryDB(request);
        if (response != null) {
            System.out.println(response);
        }
    }

    public static void main(String[] args) {
        case1();
    }
}
