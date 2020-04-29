package 设计模式.工厂.抽象工厂.共享经济.无反射;

import 设计模式.工厂.抽象工厂.共享经济.service.eats.AbstractFoodDelivery;
import 设计模式.工厂.抽象工厂.共享经济.service.grocery.AbstractGroceryDelivery;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.entity.RideRequest;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.entity.RideResponse;

public class Client {

    private static void case1() {
        // default provider
        RideRequest request = RideRequest.getSampleRequest();
        RideResponse response = ServiceController.createRideService().getRide(request);

        System.out.println(request);
        System.out.println(response);

        // non-default provider
        response = ServiceController.createRideService("Grab").getRide(request);
        System.out.println(response);
    }

    private static void case2() {
        AbstractFoodDelivery foodDelivery = ServiceController.createFoodDeliveryService();
    }

    private static void case3() {
        AbstractGroceryDelivery groceryDelivery = ServiceController.createGroceryDeliveryService();
    }

    public static void main(String[] args) {
        case1();
    }
}
