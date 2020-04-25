package 设计模式.装饰器.简单装饰器.decorators.doness;

import 设计模式.装饰器.简单装饰器.decorators.RiceDecoratorSuper;

public class Medium extends RiceDecoratorSuper {

    public String riceName() {
        return String.format("中熟 %s", super.riceName());
    }
}
