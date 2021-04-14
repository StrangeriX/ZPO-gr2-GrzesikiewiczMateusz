package zad4;

public class Transport extends OrderDecorator{
    public Transport(Order o){
        super(o);
    }

    @Override
    public String getName() {
        return order.getName()+", plus transport cost";
    }

    @Override
    public double getCost() {
        return order.getCost()+13;
    }
}
