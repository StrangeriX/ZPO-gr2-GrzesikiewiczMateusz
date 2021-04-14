package zad4;

public class OrderDecorator implements Order{
    Order order;

    public OrderDecorator(Order o){
        this.order = o;
    }

    @Override
    public String getName() {
        return order.getName();
    }

    @Override
    public double getCost() {
        return order.getCost();
    }

}
