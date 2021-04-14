package zad4;

public class Mascot extends OrderDecorator{
    public Mascot(Order o){
        super(o);
    }

    @Override
    public String getName() {
        return order.getName()+" mascot";
    }

    @Override
    public double getCost() {
        return order.getCost();
    }
}
