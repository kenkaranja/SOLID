package ocp;

public class Comfort implements DrivingMode1 {
    private static final int POWER = 400;
    private static final int SUSPENSION_HEIGHT = 20;

    public void changeDrivingMode(Vehicle1 vehicle1) {
        vehicle1.setPower(POWER);
        vehicle1.setPower(SUSPENSION_HEIGHT);
    }
}
