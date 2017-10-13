package isp;

public class Car extends Vehicle2 implements RadioSwitchI {
    private boolean radioOn;

    public void turnRadioOn() {
        radioOn = true;
    }

    public void turnRadioOff() {
        radioOn = false;
    }
}
