package pracownicy;

public class Silownia implements SpedzanieWolnegoCzasuStrategy {
    @Override
    public void spedzajCzasWolny() {
        System.out.println("Idę na siłownię");
    }
}
