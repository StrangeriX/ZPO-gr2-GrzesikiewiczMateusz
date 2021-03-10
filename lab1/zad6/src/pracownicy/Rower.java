package pracownicy;

public class Rower implements DojedzacStrategy{
    @Override
    public void dojezdzaj() {
        System.out.println("Jadę rowerem");
    }
}
