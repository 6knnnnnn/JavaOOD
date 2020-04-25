package 设计模式.装饰器.抽象装饰器.decorators.seasoning;

import 设计模式.装饰器.抽象装饰器.decorators.AbstractDishDecorator;

public class SoybeanSauce extends AbstractDishDecorator {

    @Override
    public String getDishName() {
        return String.format("加了酱油 %s", super.getDishName());
    }
}
