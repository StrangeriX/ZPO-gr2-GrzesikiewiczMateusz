package zad3;

public class Cheese extends PizzaDecorator{
    public Cheese(Pizza newPizza){
        super(newPizza);
        System.out.println("Adding Cheese");
    }

    @Override
    public String getName() {
        return newPizza.getName()+ " cheese ";
    }

    @Override
    public double getCost() {
        return newPizza.getCost()+1;
    }
}
