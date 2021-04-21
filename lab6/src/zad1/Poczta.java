package zad1;

public class Poczta implements Order{
    @Override
    public void deliver(String order) {
        System.out.println(order +" zostanie dostarczona pocztą");
    }
}
