package 设计模式.工厂.抽象工厂.共享经济.service.ride;

import 设计模式.工厂.抽象工厂.共享经济.service.ride.entity.RideRequest;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.entity.RideResponse;

import java.util.Arrays;
import java.util.List;

public class UberRide extends AbstractRideBusiness {

    private static List<String> licensesList = Arrays.asList("BMW 123", "Benz 345", "Telsa X5", "Porsche 911");

    public UberRide() {
        super("Uber X");
    }

    public RideResponse getRide(RideRequest request) {
        int index = request.getTimestamp() % licensesList.size();
        int waitingTime = request.getTimestamp() / licensesList.size();
        String license = licensesList.get(index);
        return new RideResponse(license, waitingTime, this.getProviderName());
    }
}
