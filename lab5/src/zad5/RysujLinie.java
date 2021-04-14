package zad5;

public class RysujLinie extends SterownikDecorator{
    public RysujLinie(IPloter ploter, int x, int y){
        super(ploter,x,y);
    }
}
