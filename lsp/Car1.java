package lsp;

public class Car1 extends Vehicle1 {
    public void changeGear(Gear gear) {
        setCanChangeGear(!Gear.R.equals(gear) || Gear.D.equals(getGear()));
        super.changeGear(gear);
    }
}
