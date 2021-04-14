package zad6;

import zad5.SterownikDecorator;

public class Client implements IManagerTuszu{
    SterownikDecorator ploter;

    public Client(SterownikDecorator ploter){
        this.ploter = ploter;
    }

    @Override
    public void zaladujTusz(int ilosc) {
        this.ploter.iloscTuszu+=ilosc;
    }

    @Override
    public void pobierzTusz(int ilosc) {
        this.ploter.iloscTuszu-=ilosc;
    }

    @Override
    public int sprawdzIloscTuszu() {
        return this.ploter.getIloscTuszu();
    }
}
