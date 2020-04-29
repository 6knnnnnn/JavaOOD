package 设计模式.工厂.抽象工厂.共享经济.无反射;

import 设计模式.工厂.抽象工厂.共享经济.service.eats.*;
import 设计模式.工厂.抽象工厂.共享经济.service.grocery.*;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.*;

public class ServiceController {
    private static final String DEFAULT_PROVIDER_NAME = "Uber";

    public static AbstractRideBusiness createRideService() {
        return createRideService(DEFAULT_PROVIDER_NAME);
    }

    public static AbstractRideBusiness createRideService(String providerName) {

        AbstractRideBusiness rideService;

        switch (providerName) {
            case "Uber":
                rideService = new UberRide();
                break;
            case "Meituan":
                rideService = new MeituanRide();
                break;
            case "Grab":
                rideService = new GrabRide();
                break;
            default:
                rideService = new UberRide();
        }

        return rideService;
    }

    public static AbstractFoodDelivery createFoodDeliveryService() {
        return createFoodDeliveryService(DEFAULT_PROVIDER_NAME);
    }

    public static AbstractFoodDelivery createFoodDeliveryService(String providerName) {

        AbstractFoodDelivery foodDeliveryService;

        switch (providerName) {
            case "Uber":
                foodDeliveryService = new UberEats();
                break;
            case "Meituan":
                foodDeliveryService = new MeituanEats();
                break;
            case "Grab":
                foodDeliveryService = new GrabFood();
                break;
            default:
                foodDeliveryService = new UberEats();
        }
        return foodDeliveryService;
    }


    public static AbstractGroceryDelivery createGroceryDeliveryService() {
        return createGroceryDeliveryService(DEFAULT_PROVIDER_NAME);
    }

    public static AbstractGroceryDelivery createGroceryDeliveryService(String providerName) {

        AbstractGroceryDelivery groceryDeliveryService;

        switch (providerName) {
            case "Uber":
                groceryDeliveryService = new UberCornerShop();
                break;
            case "Meituan":
                groceryDeliveryService = new MeituanMaicai();
                break;
            case "Grab":
                groceryDeliveryService = new GrabFresh();
                break;
            default:
                groceryDeliveryService = new UberCornerShop();
        }
        return groceryDeliveryService;
    }

}
