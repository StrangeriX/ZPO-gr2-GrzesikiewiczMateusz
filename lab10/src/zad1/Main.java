package zad1;

public class Main {
    public static void main(String[] args) {
        Konto klient1 = new Konto(3000);
        Konto klient2 = new Konto(5000);

        klient1.addOperacje(new Wplata(klient1, 300.0));
        System.out.println(klient1.saldo());
        klient2.wyplac(300.0);
        klient1.wykonaj();
        System.out.println(klient1.saldo());
        System.out.println(klient2.saldo());

    }
}
