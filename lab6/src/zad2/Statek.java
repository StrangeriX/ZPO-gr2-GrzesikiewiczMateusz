package zad2;

public class Statek implements Order{
    @Override
    public void deliver(String order) {
        System.out.println(order+ " zostanie wysłane statkiem");
    }
}
