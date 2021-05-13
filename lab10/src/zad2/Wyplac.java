package zad2;

public class Wyplac implements Operacja{
    Konto konto;
    double value;

    public Wyplac(Konto konto, double value){
        this.konto = konto;
        this.value = value;
    }

    @Override
    public void wykonaj() {
        konto.wyplac(this.value);
    }
}
