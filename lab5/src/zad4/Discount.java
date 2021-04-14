package zad4;

public class Discount extends OrderDecorator{
    public Discount(Order o){
        super(o);
    }

    @Override
    public String getName() {
        return order.getName()+" with discount";
    }

    @Override
    public double getCost() {
        if(order.getCost()-10 < 0){
            return 0;
        }else{
            return order.getCost()-10;
        }

    }
}
