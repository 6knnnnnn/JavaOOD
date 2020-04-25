package 设计模式.装饰器.抽象装饰器.decorators.doness;

import 设计模式.装饰器.抽象装饰器.decorators.AbstractDishDecorator;

public class Medium extends AbstractDishDecorator {

    public String getDishName() {
        return String.format("中熟 %s", super.getDishName());
    }
}
