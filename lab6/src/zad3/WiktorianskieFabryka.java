package zad3;

public class WiktorianskieFabryka implements Order{
    @Override
    public Fotel addFotel() {
        return new FotelNowoczesny();
    }

    @Override
    public Sofa addSofa() {
        return new SofaNowoczesna();
    }

    @Override
    public Stolik addStolik() {
        return new StolikNowoczesny();
    }
}
