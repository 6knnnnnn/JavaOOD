package 设计模式.模板.etlJobs;

public class PaymentETL extends AbstractETL {

    private void print() {
        System.out.println("Payment");
    }

    @Override
    public void extractData() {
        print();
    }

    @Override
    public void transformData() {
        print();
    }

    @Override
    public void loadData() {
        print();
    }
}
