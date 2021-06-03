package zad4;

public class StandardSub extends Program{
    public StandardSub(Language l, double sub){
        this.language = l;
        this.subscriptionCost = sub;
        this.notification = new SMS();
    }

    @Override
    public void showMessage() {
        System.out.println("Welcome in standard subscription");
    }

    @Override
    public void showNotification() {
        this.language.translate();
        this.notification.sendMessage();
    }
}
