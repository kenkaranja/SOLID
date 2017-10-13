package dip;

public class RacingCar implements Vehicle1 {
    private int maxFuel = 100;
    private int remainingFuel;
    private int power;

    public RacingCar(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public void accelerate() {
        power++;
        remainingFuel--;
    }
}
