package ocp;

public class Sport implements DrivingMode1 {
    private static final int POWER = 500;
    private static final int SUSPENSION_HEIGHT = 10;

    public void changeDrivingMode(Vehicle1 vehicle1) {
        vehicle1.setPower(POWER);
        vehicle1.setSuspensionHeight(SUSPENSION_HEIGHT);
    }
}
