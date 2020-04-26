package 设计模式.观察者.接口委托.subscribe;

import 设计模式.观察者.接口委托.delegate.InterfaceFetchUpdate;

public abstract class AbstractSubscriber implements InterfaceFetchUpdate {

    // publisher - delegate - subscriber
    private String subscriberName;
    private String section;

    AbstractSubscriber(String name, String section) {
        subscriberName = name;
        this.section = section;
    }

    public String toString() {
        return String.format("Subscriber name: %s, section: %s", subscriberName, section);
    }

    public String getSubscriberName() { return subscriberName; }
}
