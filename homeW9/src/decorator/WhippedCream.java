package decorator;

public class WhippedCream extends BeverageDecorator {
    public WhippedCream(Beverage beverage) {
        super(beverage);
    }
    @Override
    public double cost() {
        return super.cost() + 15.0;
    }
    @Override
    public String description() {
        return super.description() + ", Whipped Cream";
    }
}

