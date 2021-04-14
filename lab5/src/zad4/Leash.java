package zad4;

public class Leash extends OrderDecorator{
    public Leash(Order o){
        super(o);
    }

    @Override
    public String getName() {
        return order.getName()+" leash";
    }

    @Override
    public double getCost() {
        return order.getCost()+1;
    }
}
