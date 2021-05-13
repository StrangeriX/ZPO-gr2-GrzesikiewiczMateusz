package zad4;

public interface Pizza {
    void getPizzaBase();
    void addPizzaTopping();
    void addPizzaSpices();
    void bakePizza();

    public default void doPizza(){
        getPizzaBase();
        addTomatoSouce();
        addPizzaTopping();
        addPizzaSpices();
        setBakingTime();
        bakePizza();

    }

    default void addTomatoSouce(){
        System.out.println("Add tomato Souce");
    }
    default void setBakingTime(){
        System.out.println("Set baking time to 15 min");
    }
}
