package 设计模式.工厂.抽象工厂.共享经济.反射;

public class Config {
    private String rideProviderName;
    private String foodDeliveryProviderName;
    private String groceryDeliveryProviderName;

    public String getRideProviderName() {
        return rideProviderName;
    }

    public String getFoodDeliveryProviderName() {
        return foodDeliveryProviderName;
    }

    public String getGroceryDeliveryProviderName() {
        return groceryDeliveryProviderName;
    }

    private Config(String ride, String eats, String grocery) {
        rideProviderName = ride;
        foodDeliveryProviderName = eats;
        groceryDeliveryProviderName = grocery;
    }

    public static Config parseConfig() {
        // ignore the yaml parsing process, return a dummy config
        return new Config(
                "设计模式.工厂.抽象工厂.共享经济.service.ride.UberRide",
                "设计模式.工厂.抽象工厂.共享经济.service.eats.MeituanEats",
                "设计模式.工厂.抽象工厂.共享经济.service.grocery.GrabFresh");
    }
}
