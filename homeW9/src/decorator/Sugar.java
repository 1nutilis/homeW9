package decorator;

public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        return super.cost() + 5.0;
    }
    @Override
    public String description() {
        return super.description() + ", Sugar";
    }
}

