package zad3;

public class Ham extends PizzaDecorator{

    public Ham(Pizza newPizza){
        super(newPizza);
        System.out.println("Adding ham");
    }

    @Override
    public String getName() {
        return newPizza.getName()+ " ham ";
    }

    @Override
    public double getCost() {
        return newPizza.getCost()+3;
    }
}
