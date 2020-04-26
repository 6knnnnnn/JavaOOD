package 设计模式.观察者.接口委托.subscribe;

import 设计模式.观察者.News;
import 设计模式.观察者.接口委托.publish.SportNewsPublisher;

public class SportSubscriber extends AbstractSubscriber {

    private SportNewsPublisher sportNewsPublisher;
    private News latestNews;

    public SportSubscriber(SportNewsPublisher publisher, String name) {
        super(name, "Sport");
        sportNewsPublisher = publisher;
    }

    @Override
    public void fetchUpdate() {
        News latestNews = sportNewsPublisher.getLatestNews();
        if ( latestNews != null && this.latestNews != latestNews) {
            System.out.println(String.format("============%s 收到 【%s】 最新 的体育新闻更新", getSubscriberName(), sportNewsPublisher.getPublisherName()));
            System.out.println("最新的sport news: " + latestNews);
            this.latestNews = latestNews;
        }
    }
}
