package 设计模式.观察者.抽象类.publish;

import 设计模式.观察者.News;
import 设计模式.观察者.抽象类.subscribe.AbstractSubscriber;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractNewsPublisher {

    private String publisherName;
    private Set<AbstractSubscriber> subscribers;
    private News latestNews;
    private News mostPopularNews;

    AbstractNewsPublisher(String publisherName) {
        this.publisherName = publisherName;
        subscribers = new HashSet<>();
    }

    public void attach(AbstractSubscriber subscriber) {
        System.out.println(String.format("+++++++%s开始订阅%s\n", subscriber.getSubscriberName(), publisherName));
        subscribers.add(subscriber);
    }

    public void detach(AbstractSubscriber subscriber) {
        System.out.println(String.format("-------%s不再订阅%s\n", subscriber.getSubscriberName(), publisherName));
        subscribers.remove(subscriber);
    }

    private void notifyAllSubscribers() {
        for (AbstractSubscriber subscriber : subscribers) {
            subscriber.fetchUpdate();
        }
    }

    public void updateLatestNews(News news) {
        // 状态的改变会影响subscriber
        if (news != null) {
            System.out.println(this.publisherName + "有最新新闻更新");
        }
        latestNews = news;
        notifyAllSubscribers();
    }

    public void updateMostPopularNews(News news) {
        // 状态的改变会影响subscriber
        if (news != null) {
            System.out.println(this.publisherName + "收到最流行新闻更新");
        }
        mostPopularNews = news;
        notifyAllSubscribers();
    }

    public News getLatestNews() { return latestNews; }

    public News getMostPopularNews() { return mostPopularNews; }

    public String toString() {
        return String.format("Publisher name: %s\nLatest news: %s\nMost popular news: %s\nSubscriber count: %d\n\n", publisherName, latestNews, mostPopularNews, subscribers.size());
    }

    public String getPublisherName() { return publisherName; }
}
