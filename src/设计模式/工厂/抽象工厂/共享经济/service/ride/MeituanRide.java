package 设计模式.工厂.抽象工厂.共享经济.service.ride;

import 设计模式.工厂.抽象工厂.共享经济.service.ride.entity.RideRequest;
import 设计模式.工厂.抽象工厂.共享经济.service.ride.entity.RideResponse;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MeituanRide extends AbstractRideBusiness {

    private static List<String> licensesList = Arrays.asList("car1", "car2", "car3", "car4");
    private static Random rnd = new Random();

    public MeituanRide() {
        super("美团出行");
    }

    public RideResponse getRide(RideRequest request) {
        int index = rnd.nextInt(licensesList.size());
        int waitingTime = request.getTimestamp() + rnd.nextInt(10000);
        return new RideResponse(licensesList.get(index), waitingTime, this.getProviderName());
    }
}
