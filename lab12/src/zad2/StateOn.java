package zad2;

public class StateOn extends State{

    StateOn(TV tv){
        super(tv);
        tv.setOn(true);
    }
    @Override
    public String onStateOn() {
        this.tv.setState(new StateNeutral(tv));
        return "TV is on, channel: "+tv.getChannel();
    }

    @Override
    public String onStateOff() {
        this.tv.setState(new StateOff(tv));
        return "TV is off";
    }

    @Override
    public String onStateNext() {
        return tv.nextChannel();
    }

    @Override
    public String onStatePrev() {
        return tv.prevChannel();
    }
}
