package zad4;

public class SMS implements Notification{
    @Override
    public void sendMessage() {
        System.out.println("Message send by SMS");
    }
}
