package srp;

public class Vehicle {
    final private float maxFuel = 100;

    private float remainingFuel;

    public float getMaxFuel() {
        return maxFuel;
    }

    public void accelerate() {
        remainingFuel--;
    }
}
