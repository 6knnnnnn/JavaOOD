package 设计模式.装饰器.简单装饰器.decorators;

import 设计模式.装饰器.简单装饰器.Rice;

public abstract class RiceDecoratorSuper extends Rice {

    private Rice coreClass;

    public void setRice(Rice rice) {
        // Setter method
        this.coreClass = rice;
    }
    
    @Override
    public String riceName() {
        return String.format("%s", this.coreClass.riceName());
    }
}
