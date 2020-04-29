package 设计模式.工厂.抽象工厂.共享经济.反射;

import 设计模式.工厂.抽象工厂.共享经济.service.eats.AbstractFoodDelivery;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.AbstractRideBusiness;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.entity.RideRequest;

public class Client {
    private static void case1() {
        RideRequest request = RideRequest.getSampleRequest();
        Config config = Config.parseConfig();

        AbstractRideBusiness rideBusiness = ServiceController.getRide(config.getRideProviderName());
        System.out.println(request);
        System.out.println(rideBusiness.getRide(request));
    }

    private static void case2() {
        Config config = Config.parseConfig();
        AbstractFoodDelivery foodDelivery = ServiceController.getFoodDelivery(config.getFoodDeliveryProviderName());
        System.out.println(foodDelivery );
    }

    public static void main(String[] args) {
        case1();
        case2();
    }
}
