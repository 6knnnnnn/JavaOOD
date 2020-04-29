package 设计模式.工厂.抽象工厂.共享经济.company;

import 设计模式.工厂.抽象工厂.共享经济.service.eats.AbstractFoodDelivery;
import 设计模式.工厂.抽象工厂.共享经济.service.eats.MeituanEats;
import 设计模式.工厂.抽象工厂.共享经济.service.grocery.AbstractGroceryDelivery;
import 设计模式.工厂.抽象工厂.共享经济.service.grocery.MeituanMaicai;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.AbstractRideBusiness;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.MeituanRide;

public class Meituan implements AbstractGigCompany {

    @Override
    public AbstractRideBusiness getRideService() {
        return new MeituanRide();
    }

    @Override
    public AbstractGroceryDelivery getGroceryService() {
        return new MeituanMaicai();
    }

    @Override
    public AbstractFoodDelivery getFoodDeliveryService() {
        return new MeituanEats();
    }
}
