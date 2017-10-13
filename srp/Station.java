package srp;

public class Station {

    private float remainingFuel;

    public void refuel() {
        Vehicle vehicle = new Vehicle();
        remainingFuel = vehicle.getMaxFuel();
    }
}
