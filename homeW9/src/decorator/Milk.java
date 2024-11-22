package decorator;

public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        return super.cost() + 10.0;
    }
    @Override
    public String description() {
        return super.description() + ", Milk";
    }
}
