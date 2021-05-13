package zad4;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Sicilian();
        pizza.doPizza();

        pizza = new Margherita();
        pizza.doPizza();
    }
}
