package pracownicy;

public class Leczenie implements PracowacStrategy{
    @Override
    public void pracuj() {
        System.out.println("Lecz");
    }
}
