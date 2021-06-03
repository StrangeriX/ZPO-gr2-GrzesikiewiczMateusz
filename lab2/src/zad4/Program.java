package zad4;

public abstract class Program {
    Language language;
    Notification notification;
    double subscriptionCost;

    public abstract void showMessage();
    public abstract void showNotification();

    public void changeLanguage(Language l){
        this.language = l;
    }
}
