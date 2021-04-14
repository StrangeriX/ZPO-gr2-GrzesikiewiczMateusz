package zad3;

public class PizzaDecorator implements Pizza{
    Pizza newPizza;

    public PizzaDecorator(Pizza pizza){
        this.newPizza = pizza;
    }

    @Override
    public void removeDecorator(PizzaDecorator remove) {
        if(newPizza == null){
            return;
        }
        else if(newPizza.equals(remove)){
            newPizza = newPizza.getInstance();
        }
        else{
            newPizza.removeDecorator(remove);
        }
    }

    @Override
    public String getName() {
        return newPizza.getName();
    }

    @Override
    public double getCost() {
        return newPizza.getCost();
    }

    @Override
    public Pizza getInstance() {
        return newPizza;
    }
}
