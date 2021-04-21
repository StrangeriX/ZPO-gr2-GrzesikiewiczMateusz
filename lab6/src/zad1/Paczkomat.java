package zad1;

public class Paczkomat implements Order{
    @Override
    public void deliver(String order) {
        System.out.println(order + " zostanie dostarczona do paczkomatu");
    }
}
