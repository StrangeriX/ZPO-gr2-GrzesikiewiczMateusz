package podatki;

public class Podatek {
    private double wartosc = 0;
    private OpodatkowanieStrategy opodatkowanieStrategy;

    public Podatek(double wartosc, OpodatkowanieStrategy kraj){
        this.wartosc = wartosc;
        this.opodatkowanieStrategy = kraj;
    }

    public void setOpodatkowanieStrategy(OpodatkowanieStrategy opodatkowanieStrategy) {
        this.opodatkowanieStrategy = opodatkowanieStrategy;
    }

    public double obliczWartosc() {
        return opodatkowanieStrategy.opodatkowanie(this.wartosc);
    }
}
