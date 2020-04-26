package 设计模式.观察者.接口委托.subscribe;

import 设计模式.观察者.接口委托.publish.FinanceNewsPublisher;

public class FinanceSubscriber extends AbstractSubscriber {

    private FinanceNewsPublisher financeNewsPublisher;

    public FinanceSubscriber(FinanceNewsPublisher publisher, String name) {
        super(name, "Finance");
        financeNewsPublisher = publisher;
    }

    @Override
    public void fetchUpdate() {
        System.out.println(String.format("======%s= 收到 =%s= 的财经新闻更新", getSubscriberName(), financeNewsPublisher.getPublisherName()));
    }
}
