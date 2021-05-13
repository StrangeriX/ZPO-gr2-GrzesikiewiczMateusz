package zad4;

public class Sicilian implements Pizza{

    @Override
    public void getPizzaBase() {
        System.out.println("Get thick pizza base");
    }

    @Override
    public void addPizzaTopping() {
        System.out.println("Add olives and papers");
    }

    @Override
    public void addPizzaSpices() {
        System.out.println("Add sicilian spices");
    }

    @Override
    public void bakePizza() {
        System.out.println("Baking sicilian pizza");
    }
}
