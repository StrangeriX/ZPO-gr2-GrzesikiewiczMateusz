package zad7;

import zad5.IPloter;
import zad6.IManagerTuszu;

public class BetterSterownik implements IPloter, IManagerTuszu {
    IPloter ploter;
    IManagerTuszu manager;
    public BetterSterownik(IPloter ploter, IManagerTuszu manager){
        this.manager = manager;
        this.ploter = ploter;
    }
    @Override
    public void ustalPozycje(int x, int y) {
        this.ploter.ustalPozycje(x, y);
    }

    @Override
    public void rysujDo(int x, int y) {
        this.ploter.rysujDo(x, y);
    }

    @Override
    public void zaladujTusz(int ilosc) {
        this.manager.zaladujTusz(ilosc);
    }

    @Override
    public void pobierzTusz(int ilosc) {
        this.manager.pobierzTusz(ilosc);
    }

    @Override
    public int sprawdzIloscTuszu() {
        return  this.manager.sprawdzIloscTuszu();
    }
}
