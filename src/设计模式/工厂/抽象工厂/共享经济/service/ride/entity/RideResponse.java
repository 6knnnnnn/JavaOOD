package 设计模式.工厂.抽象工厂.共享经济.service.ride.entity;

public class RideResponse {

    private String licenseNumber;
    private int waitingTime;
    private String rideProductName;

    public RideResponse(String licenseNumber, int waitingTime, String rideProductName) {
        this.licenseNumber = licenseNumber;
        this.waitingTime = waitingTime;
        this.rideProductName = rideProductName;
    }

    public String toString() {
        return String.format("%s: please wait %d for seconds for car with license of %s", rideProductName, waitingTime, licenseNumber);
    }
}
