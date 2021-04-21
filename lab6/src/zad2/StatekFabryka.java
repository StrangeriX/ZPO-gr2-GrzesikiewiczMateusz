package zad2;

public class StatekFabryka extends TransportFabryka{
    @Override
    protected Order deliverWay() {
        return new Statek();
    }
}
