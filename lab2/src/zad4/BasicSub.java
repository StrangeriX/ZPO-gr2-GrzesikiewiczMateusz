package zad4;

public class BasicSub extends Program{
    public BasicSub(Language l, double sub){
        this.language = l;
        this.subscriptionCost = sub;
        this.notification = new Email();
    }
    @Override
    public void showMessage(){
        System.out.println("Welcome in basic subscription");
    }

    @Override
    public void showNotification() {
        this.language.translate();
        this.notification.sendMessage();
    }

}
