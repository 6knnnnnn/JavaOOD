package 设计模式.工厂.抽象工厂.共享经济.service.eats;

public abstract class AbstractFoodDelivery {

    private String providerName;

    public AbstractFoodDelivery(String providerName) {
        this.providerName = providerName;
    }

    public String toString() {
        return providerName;
    }
}
