package podatki;

public class NakladaniePodatkow {
    private class PolskiePodatki implements OpodatkowanieStrategy{
        @Override
        public double opodatkowanie(double wartosc) {
            double podatek = wartosc * 0.23;
            return wartosc+ podatek;
        }
    }
    private class  NiemieckiPodatek implements OpodatkowanieStrategy{
        @Override
        public double opodatkowanie(double wartosc) {
            double podatek = wartosc * 0.18;
            return wartosc+podatek;
        }
    }
    private class AngielskiPodatek implements OpodatkowanieStrategy{
        @Override
        public double opodatkowanie(double wartosc) {
            double podatek = wartosc * 0.2;
            return wartosc+podatek;
        }
    }

    public NakladaniePodatkow(double wartosc){
        new Podatek(wartosc, new PolskiePodatki()).obliczWartosc();
        new Podatek(wartosc, new NiemieckiPodatek()).obliczWartosc();
        new Podatek(wartosc, new AngielskiPodatek()).obliczWartosc();
    }
}
