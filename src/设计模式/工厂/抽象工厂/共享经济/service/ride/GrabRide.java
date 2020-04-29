package 设计模式.工厂.抽象工厂.共享经济.service.ride;

import 设计模式.工厂.抽象工厂.共享经济.service.ride.entity.RideRequest;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.entity.RideResponse;

import java.util.Arrays;
import java.util.List;

public class GrabRide extends AbstractRideBusiness {

    private static List<String> licensesList = Arrays.asList("car1", "car2", "car3", "car4");
    private static int roundRobinIndex = 0;

    public GrabRide() {
        super("Grab Express");
    }

    public RideResponse getRide(RideRequest request) {
        String license = licensesList.get(roundRobinIndex);
        roundRobinIndex = (roundRobinIndex + 1) % licensesList.size();
        int waitingTime = request.getTimestamp() + 1000;
        return new RideResponse(license, waitingTime, this.getProviderName());
    }
}
