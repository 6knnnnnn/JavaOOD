package 设计模式.装饰器.简单装饰器;

import 设计模式.装饰器.简单装饰器.decorators.doness.Medium;
import 设计模式.装饰器.简单装饰器.decorators.seasoning.Curry;
import 设计模式.装饰器.简单装饰器.decorators.seasoning.SoybeanSauce;

public class Client {

    private static void print(Rice rice) {
        System.out.println(rice.riceName());
    }

    private static void case1() {
        System.out.println("case1======");

        Rice chickenRice = new Rice("鸡肉");

        // 加了咖喱的鸡肉饭
        Curry curryRice = new Curry();
        curryRice.setRice(chickenRice);

        print(curryRice);
    }

    private static void case2() {
        System.out.println("case2======");
        // 加了咖喱 + 酱油的鸡肉饭
        Rice chickenRice = new Rice("鸡肉");

        Curry curryRice = new Curry();
        curryRice.setRice(chickenRice);

        SoybeanSauce sbSauceRice = new SoybeanSauce();
        sbSauceRice.setRice(curryRice);

        print(sbSauceRice);
    }

    private static void case3() {
        System.out.println("case3======");
        Rice beefRice = new Rice("牛肉");

        // 加了咖喱的中熟牛肉饭
        Curry curryRice = new Curry();
        curryRice.setRice(beefRice);

        Medium mediumBeef = new Medium();
        mediumBeef.setRice(curryRice);

        print(mediumBeef);
    }

    public static void main(String[] args) {
        case1();
        case2();
        case3();
    }
}
