package 设计模式.装饰器.抽象装饰器;

import 设计模式.装饰器.抽象装饰器.dish.*;
import 设计模式.装饰器.抽象装饰器.decorators.seasoning.*;
import 设计模式.装饰器.抽象装饰器.decorators.doness.*;

public class Client {

    private static void print(AbstractDish dish) {
        System.out.println(dish.getDishName());
    }

    private static void case1() {
        System.out.println("case1======");

        AbstractDish chickenRice = new Rice("鸡肉");

        // 加了咖喱的鸡肉饭
        Curry curryRice = new Curry();
        curryRice.setDish(chickenRice);

        print(curryRice);
    }

    private static void case2() {
        System.out.println("case2======");
        // 加了咖喱 + 酱油的鸡肉面
        AbstractDish chickenNoodle = new Noodle("鸡肉");

        Curry curryRice = new Curry();
        curryRice.setDish(chickenNoodle);

        SoybeanSauce sbSauceRice = new SoybeanSauce();
        sbSauceRice.setDish(curryRice);

        print(sbSauceRice);
    }

    private static void case3() {
        System.out.println("case3======");
        AbstractDish beefRice = new Rice("牛肉");

        // 加了咖喱的中熟牛肉饭
        Curry curryRice = new Curry();
        curryRice.setDish(beefRice);

        Medium mediumBeef = new Medium();
        mediumBeef.setDish(curryRice);

        print(mediumBeef);
    }

    public static void main(String[] args) {
        case1();
        case2();
        case3();
    }
}
