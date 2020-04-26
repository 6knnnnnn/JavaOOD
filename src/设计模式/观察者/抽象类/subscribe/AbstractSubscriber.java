package 设计模式.观察者.抽象类.subscribe;

public abstract class AbstractSubscriber {

    private String subscriberName;
    private String section;

    AbstractSubscriber(String name, String section) {
        subscriberName = name;
        this.section = section;
    }

    public String toString() {
        return String.format("Subscriber name: %s, section: %s", subscriberName, section);
    }

    // 关键方法
    public abstract void fetchUpdate();

    public String getSubscriberName() { return subscriberName; }
}
