package zad1;

public class Przelew implements Operacja{
    Konto nadawca;
    Konto odbiorca;
    double value;

    public Przelew(Konto nadawca, Konto odbiorca, double value){
        this.nadawca = nadawca;
        this.odbiorca = odbiorca;
        this.value = value;
    }

    @Override
    public void wykonaj() {
        nadawca.wyplac(this.value);
        odbiorca.wplac(this.value);
    }
}
