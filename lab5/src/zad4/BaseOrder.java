package zad4;

public class BaseOrder extends OrderDecorator{
    private double fullCost;

    public BaseOrder(double cost){
        super(null);
        this.fullCost = cost;
    }

    @Override
    public String getName() {
        return "Base order";
    }

    @Override
    public double getCost() {
        return this.fullCost;
    }
}
