package 设计模式.工厂.抽象工厂.共享经济.service.ride;

import 设计模式.工厂.抽象工厂.共享经济.service.ride.entity.RideRequest;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.entity.RideResponse;

public abstract class AbstractRideBusiness {

    private String providerName;

    AbstractRideBusiness(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    public abstract RideResponse getRide(RideRequest request);

    public String toString() {
        return providerName;
    }
}
