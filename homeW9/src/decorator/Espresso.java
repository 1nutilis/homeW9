package decorator;

public class Espresso implements Beverage {
    @Override
    public double cost() {
        return 70.0;
    }
    @Override
    public String description() {
        return "Espresso";
    }
}

