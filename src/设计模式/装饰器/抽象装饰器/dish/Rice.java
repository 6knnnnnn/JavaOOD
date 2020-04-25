package 设计模式.装饰器.抽象装饰器.dish;

public class Rice extends AbstractDish {

    public Rice(String riceName) {
        dishName = riceName;
    }

    public String getDishName() {
        return String.format("%s饭", dishName);
    }
}
