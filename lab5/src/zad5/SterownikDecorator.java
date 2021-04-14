package zad5;

public class SterownikDecorator implements IPloter{
    IPloter ploter;

    int startX;
    int endX;
    int startY;
    int endY;
    public int maxIloscTuszu;
    public int iloscTuszu;

    public SterownikDecorator(IPloter ploter, int x, int y){
        this.ploter = ploter;

        rysujDo(x, y);
    }

    @Override
    public void ustalPozycje(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void rysujDo(int x, int y) {
        this.endX = x;
        this.startY = y;
    }

    public int getIloscTuszu(){
        return iloscTuszu;
    }
}
