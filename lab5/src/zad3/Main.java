package zad3;

public class Main {
    public static void main(String[] args) {
        PizzaDecorator PizzaBase = new PizzaBase();
        PizzaDecorator Ham = new Ham(PizzaBase);
        PizzaDecorator Cheese = new Cheese(Ham);

        System.out.println("The pizza: " + Cheese.getName());
        System.out.println("The cost: " + Cheese.getCost());

        Cheese.removeDecorator(Ham);

        System.out.println("The pizza: " + Cheese.getName());
        System.out.println("The cost: " + Cheese.getCost());
    }
}
