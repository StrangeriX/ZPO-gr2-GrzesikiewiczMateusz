package zad3;

public class NowoczesneFabryka implements Order{
    @Override
    public Stolik addStolik() {
        return new StolikNowoczesny();
    }

    @Override
    public Sofa addSofa() {
        return new SofaNowoczesna();
    }

    @Override
    public Fotel addFotel() {
        return new FotelNowoczesny();
    }
}
