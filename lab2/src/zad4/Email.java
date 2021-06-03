package zad4;

public class Email implements Notification{

    @Override
    public void sendMessage() {
        System.out.println("Message send by Email");
    }
}
