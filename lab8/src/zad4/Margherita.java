package zad4;

public class Margherita implements Pizza {
    @Override
    public void getPizzaBase() {
        System.out.println("Get thin pizza base");
    }

    @Override
    public void addPizzaTopping() {
        System.out.println("Add a lot of mozzarella");
    }

    @Override
    public void addPizzaSpices() {
        System.out.println("Add basil and olive oil");
    }

    @Override
    public void bakePizza() {
        System.out.println("Baking Margherita");
    }
}
