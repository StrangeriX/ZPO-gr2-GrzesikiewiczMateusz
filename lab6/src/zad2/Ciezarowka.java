package zad2;

public class Ciezarowka implements Order{
    @Override
    public void deliver(String order) {
        System.out.println(order + "Zostanie wysłane ciężarówką");
    }
}
