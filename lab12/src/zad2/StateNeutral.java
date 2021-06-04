package zad2;

public class StateNeutral extends State{

    StateNeutral(TV tv){
        super(tv);
    }
    @Override
    public String onStateOn() {
        tv.setState(new StateOn(tv));
        return "Channel: "+tv.getChannel();
    }

    @Override
    public String onStateOff() {
        tv.setState(new StateOff(tv));
        return "TV is off";
    }

    @Override
    public String onStateNext() {
        return "Nothing happened";
    }

    @Override
    public String onStatePrev() {
        return "Nothing happened";
    }
}
