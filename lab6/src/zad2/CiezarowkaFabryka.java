package zad2;

public class CiezarowkaFabryka extends TransportFabryka{
    @Override
    protected Order deliverWay() {
        return new Ciezarowka();
    }
}
