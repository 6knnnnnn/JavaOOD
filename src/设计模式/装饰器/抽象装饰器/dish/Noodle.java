package 设计模式.装饰器.抽象装饰器.dish;

public class Noodle extends AbstractDish {

    public Noodle (String noodleName) {
        dishName = noodleName;
    }

    public String getDishName() {
        return String.format("%s面", dishName);
    }
}
