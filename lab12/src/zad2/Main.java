package zad2;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println("Welcome on our tv");
        System.out.println("Is the tv on: "+ tv.isOn());
        tv.setState(new StateOn(tv));
        tv.getState().onStateNext();
        tv.getState().onStateNext();
        System.out.println("Is the tv on: "+ tv.isOn());
        System.out.println("Channel:" +tv.getChannel());
        tv.setState(new StateOff(tv));
        System.out.println("Is the tv on: "+ tv.isOn());
        System.out.println(tv.getState().onStateOff());
    }
}
