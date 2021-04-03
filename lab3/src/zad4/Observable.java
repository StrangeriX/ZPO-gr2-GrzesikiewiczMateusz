package zad4;



public interface Observable {
    public void addObserver(Observer observer);
    public void deleteObserver(Observer observer);
    public void notifyObservers();
}
