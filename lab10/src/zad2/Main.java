package zad2;

public class Main {
    public static void main(String[] args) {
        Konto klient1 = new Konto(5000);
        Konto klient2 = new Konto(4000);

        Bank bank = new Bank();

        bank.addClient(klient1);
        bank.addMessage("Witamy w naszym banku");
        bank.notifyClient();
        bank.addClient(klient2);
        bank.notifyClient();
    }
}
