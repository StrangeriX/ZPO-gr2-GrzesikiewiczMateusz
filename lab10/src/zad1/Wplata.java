package zad1;

public class Wplata implements Operacja{
    Konto konto;
    Double value;

    public Wplata(Konto konto, Double value){
        this.konto = konto;
        this.value = value;
    }

    @Override
    public void wykonaj() {
        konto.wplac(this.value);
    }
}
