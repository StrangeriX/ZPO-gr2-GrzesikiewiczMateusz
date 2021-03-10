package pracownicy;

public class Samochod implements DojedzacStrategy{
    @Override
    public void dojezdzaj() {
        System.out.println("Jadę samochodem");
    }
}
