package decorator;

public class Tea implements Beverage {
    @Override
    public double cost() {
        return 40.0;
    }
    @Override
    public String description() {
        return "Tea";
    }
}
