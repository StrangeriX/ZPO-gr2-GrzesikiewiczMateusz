package zad3;

public class ArtDecoFabryka implements Order{
    @Override
    public Fotel addFotel() {
        return new FotelArtDeco();
    }

    @Override
    public Sofa addSofa() {
        return new SofaArtDeco();
    }

    @Override
    public Stolik addStolik() {
        return new StolikArtDeco();
    }
}
