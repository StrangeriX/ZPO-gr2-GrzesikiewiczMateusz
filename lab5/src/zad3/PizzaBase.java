package zad3;

public class PizzaBase extends PizzaDecorator{
    public PizzaBase(){
        super(null);
        System.out.println("Pizza base");
    }

    @Override
    public String getName() {
        return "base";
    }

    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public Pizza getInstance() {
        return this;
    }
}
