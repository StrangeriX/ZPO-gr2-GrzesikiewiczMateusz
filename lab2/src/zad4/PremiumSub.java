package zad4;

public class PremiumSub extends Program{
    public PremiumSub(Language l, double sub){
        this.language = l;
        this.subscriptionCost = sub;
        this.notification = new VoiceMessage();
    }

    @Override
    public void showMessage() {
        System.out.println("Welcome in premium subscription");
    }

    @Override
    public void showNotification() {
        this.language.translate();
        this.notification.sendMessage();
    }
}
