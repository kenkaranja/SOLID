package isp;

public class Drone extends Vehicle2 implements CameraSwitchI {
    private boolean cameraOn;

    public void turnCameraOn() {
        cameraOn = true;
    }

    public void turnCameraOff() {
        cameraOn = false;
    }
}