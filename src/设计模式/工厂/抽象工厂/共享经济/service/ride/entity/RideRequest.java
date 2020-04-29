package 设计模式.工厂.抽象工厂.共享经济.service.ride.entity;

public class RideRequest {

    private int timestamp;
    private String pickUpAddress;
    private String dropOffAddress;

    public RideRequest(int timestamp, String pickUpAddress, String dropOffAddress) {
        this.timestamp = timestamp;
        this.pickUpAddress = pickUpAddress;
        this.dropOffAddress = dropOffAddress;
    }

    public String toString() {
        return String.format("At time %d, from %s, to %s", timestamp, pickUpAddress, dropOffAddress);
    }

    public int getTimestamp() {
        return timestamp;
    }

    public static RideRequest getSampleRequest() {
        return new RideRequest(12345, "1 Powll St", "1455 Market St");
    }
}
