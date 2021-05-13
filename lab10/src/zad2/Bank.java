package zad2;

import java.util.ArrayList;
import java.util.List;

public class Bank implements Wiadomosc{
    private List<Konto> notifyClients = new ArrayList<Konto>();
    private List<String> Notifications = new ArrayList<String>();

    @Override
    public void addClient(Konto konto) {
        notifyClients.add(konto);
    }

    @Override
    public void removeClient(Konto konto) {
        notifyClients.remove(konto);
    }

    public void addMessage(String message){
        Notifications.add(message);
    }

    @Override
    public void notifyClient() {
        for(Konto konto: notifyClients){
            int message = Notifications.size()-1;
            konto.update(Notifications.get(message));
        }
    }
}
