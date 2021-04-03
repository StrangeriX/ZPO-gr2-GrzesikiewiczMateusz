package zad3;

public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver();
    public void notifyObservers();
}
