package pracownicy;

public class LiteraturaPopularnoNaukowa implements SpedzanieWolnegoCzasuStrategy {
    @Override
    public void spedzajCzasWolny() {
        System.out.println("Czytam książki");
    }
}
