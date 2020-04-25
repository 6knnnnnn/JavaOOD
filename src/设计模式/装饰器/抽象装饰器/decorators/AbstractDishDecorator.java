package 设计模式.装饰器.抽象装饰器.decorators;

import 设计模式.装饰器.抽象装饰器.dish.AbstractDish;

public abstract class AbstractDishDecorator extends AbstractDish {

    private AbstractDish coreClass;

    public void setDish(AbstractDish dish) {
        // Setter method
        this.coreClass = dish;
    }
    
    @Override
    public String getDishName() {
        return String.format("%s", this.coreClass.getDishName());
    }
}
