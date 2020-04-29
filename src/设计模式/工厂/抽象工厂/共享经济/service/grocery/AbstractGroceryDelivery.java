package 设计模式.工厂.抽象工厂.共享经济.service.grocery;

public abstract class AbstractGroceryDelivery {

    private String serviceProviderName;

    AbstractGroceryDelivery(String name) {
        serviceProviderName = name;
    }
}
