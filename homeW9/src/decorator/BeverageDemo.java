package decorator;

public class BeverageDemo {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.description() + " : " + beverage.cost());

        beverage = new Milk(beverage);
        System.out.println(beverage.description() + " : " + beverage.cost());

        beverage = new Sugar(beverage);
        System.out.println(beverage.description() + " : " + beverage.cost());

        beverage = new WhippedCream(beverage);
        System.out.println(beverage.description() + " : " + beverage.cost());
    }
}
