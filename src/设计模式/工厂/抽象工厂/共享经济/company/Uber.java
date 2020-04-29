package 设计模式.工厂.抽象工厂.共享经济.company;

import 设计模式.工厂.抽象工厂.共享经济.service.eats.AbstractFoodDelivery;
import 设计模式.工厂.抽象工厂.共享经济.service.eats.UberEats;
import 设计模式.工厂.抽象工厂.共享经济.service.grocery.AbstractGroceryDelivery;
import 设计模式.工厂.抽象工厂.共享经济.service.grocery.UberCornerShop;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.AbstractRideBusiness;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.UberRide;

public class Uber implements AbstractGigCompany {

    @Override
    public AbstractRideBusiness getRideService() {
        return new UberRide();
    }

    @Override
    public AbstractGroceryDelivery getGroceryService() {
        return new UberCornerShop();
    }

    @Override
    public AbstractFoodDelivery getFoodDeliveryService() {
        return new UberEats();
    }
}
