package 设计模式.工厂.简单工厂;

import 设计模式.工厂.简单工厂.dbAccessObject.DB2DAO;
import 设计模式.工厂.简单工厂.dbAccessObject.InterfaceDAO;
import 设计模式.工厂.简单工厂.dbAccessObject.MySqlDAO;
import 设计模式.工厂.简单工厂.dbAccessObject.OracleDAO;

public class DAOFactory {

    public static InterfaceDAO createDAO (String dbName) {
        switch (dbName)
        {
            case "mysql": return new MySqlDAO();
            case "oracle": return new OracleDAO();
            case "db2": return new DB2DAO();
        }
        // default MySQL
        return new MySqlDAO();
    }
}
