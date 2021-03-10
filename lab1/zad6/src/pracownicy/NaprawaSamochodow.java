package pracownicy;

public class NaprawaSamochodow implements PracowacStrategy{
    @Override
    public void pracuj() {
        System.out.println("Naprawiaj samochody");
    }
}
