package 设计模式.装饰器.简单装饰器.decorators.seasoning;

import 设计模式.装饰器.简单装饰器.decorators.RiceDecoratorSuper;

public class Curry extends RiceDecoratorSuper {

    @Override
    public String riceName() {
        return String.format("加了咖喱 %s", super.riceName());
    }
}
