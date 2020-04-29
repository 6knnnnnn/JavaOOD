package 设计模式.工厂.抽象工厂.共享经济.反射;

import 设计模式.工厂.抽象工厂.共享经济.service.eats.AbstractFoodDelivery;
import 设计模式.工厂.抽象工厂.共享经济.service.grocery.AbstractGroceryDelivery;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.AbstractRideBusiness;

public class ServiceController {

    private static Object getClass(Class targetClass, String providerName) {
        try {
            // use reflection instead of switch case
            Class c = Class.forName(providerName);
            return targetClass.cast(c.newInstance());
        } catch (Exception exp) {
            exp.printStackTrace();
        }
        return null;
    }

    public static AbstractRideBusiness getRide(String providerName) {
        return (AbstractRideBusiness) getClass(AbstractRideBusiness.class, providerName);
    }

    public static AbstractFoodDelivery getFoodDelivery(String providerName) {
        return (AbstractFoodDelivery) getClass(AbstractFoodDelivery.class, providerName);
    }

    public static AbstractGroceryDelivery getGroceryDelivery(String providerName) {
        return (AbstractGroceryDelivery) getClass(AbstractGroceryDelivery.class, providerName);
    }
}
