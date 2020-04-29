package 设计模式.工厂.抽象工厂.共享经济.company;

import 设计模式.工厂.抽象工厂.共享经济.service.eats.AbstractFoodDelivery;
import 设计模式.工厂.抽象工厂.共享经济.service.grocery.AbstractGroceryDelivery;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.AbstractRideBusiness;
//import 设计模式.工厂.抽象工厂.共享经济.service.selfdriving.AbstractSelfDrivingService;

public interface AbstractGigCompany {

    AbstractRideBusiness getRideService();

    AbstractGroceryDelivery getGroceryService();

    AbstractFoodDelivery getFoodDeliveryService();

//    AbstractSelfDrivingService getSelfDrivingService();
}
