package zad3;

public interface Pizza {
    public String getName();
    public double getCost();
    public Pizza getInstance();

    public void removeDecorator(PizzaDecorator remove);
}
