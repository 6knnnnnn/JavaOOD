package 设计模式.模板;

import 设计模式.模板.etlJobs.AbstractETL;
import 设计模式.模板.etlJobs.OrderETL;
import 设计模式.模板.etlJobs.PaymentETL;
import 设计模式.模板.etlJobs.ProductETL;

public class Client {

    private static void test(AbstractETL etl) {
        etl.etlJob();
    }
    private static void case1() {
        test(new OrderETL());
        test(new PaymentETL());
        test(new ProductETL());
    }

    public static void main(String[] args) {
        case1();
    }
}
