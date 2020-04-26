package 设计模式.观察者.接口委托.publish;

import 设计模式.观察者.接口委托.delegate.UpdateEventHandler;
import 设计模式.观察者.接口委托.subscribe.AbstractSubscriber;
import 设计模式.观察者.News;

public abstract class AbstractNewsPublisher {

    private String publisherName;
    // publisher不再知道subscriber的存在，而是他们中间多了一个delegate关系
    private UpdateEventHandler updateHandler;
    private News latestNews;
    private News mostPopularNews;

    AbstractNewsPublisher(String publisherName) {
        this.publisherName = publisherName;
        updateHandler = new UpdateEventHandler();
    }

    public void attach(AbstractSubscriber subscriber) {
        System.out.println(String.format("+++++++%s开始订阅%s\n", subscriber.getSubscriberName(), publisherName));
        updateHandler.addHandler(subscriber);
    }

    public void detach(AbstractSubscriber subscriber) {
        System.out.println(String.format("-------%s不再订阅%s\n", subscriber.getSubscriberName(), publisherName));
        updateHandler.removeHandler(subscriber);
    }

    private void sendNotification() {
        updateHandler.handleFetchUpdate();
    }

    public void updateLatestNews(News news) {
        // 状态的改变会影响subscriber
        if (news != null) {
            System.out.println(this.publisherName + "有最新新闻更新");
        }
        latestNews = news;
        sendNotification();
    }

    public void updateMostPopularNews(News news) {
        // 状态的改变会影响subscriber
        if (news != null) {
            System.out.println(this.publisherName + "有最流行新闻更新");
        }
        mostPopularNews = news;
        sendNotification();
    }

    public News getLatestNews() { return latestNews; }

    public News getMostPopularNews() { return mostPopularNews; }

    public String toString() {
        return String.format("Publisher name: %s\nLatest news: %s\nMost popular news: %s\nSubscriber count: %d\n\n", publisherName, latestNews, mostPopularNews, updateHandler.getCount());
    }

    public String getPublisherName() { return publisherName; }
}
