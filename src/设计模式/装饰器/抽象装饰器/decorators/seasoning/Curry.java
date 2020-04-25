package 设计模式.装饰器.抽象装饰器.decorators.seasoning;

import 设计模式.装饰器.抽象装饰器.decorators.AbstractDishDecorator;

public class Curry extends AbstractDishDecorator {

    @Override
    public String getDishName() {
        return String.format("加了咖喱 %s", super.getDishName());
    }
}
