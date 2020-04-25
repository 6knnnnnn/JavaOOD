package 设计模式.装饰器.简单装饰器;

public class Rice {

    private String riceName;

    protected Rice() {
        // 空的constructor
    }

    public Rice(String name) {
        this.riceName = name;
    }

    public String riceName() {
        return String.format("%s饭", riceName);
    }
}
