package zad2;

public class StateOff extends State{

    StateOff(TV tv){
        super(tv);
        tv.setOn(false);
    }

    @Override
    public String onStateOn() {
        tv.setState(new StateOn(tv));
        return "TV is on";
    }

    @Override
    public String onStateOff() {
        if(tv.isOn()){
            tv.setState(new StateNeutral(tv));
            return "TV is off";
        }else{
            return "Nothing happened";
        }
    }

    @Override
    public String onStateNext() {
        tv.setState(new StateNeutral(tv));
        return "TV is off";
    }

    @Override
    public String onStatePrev() {
        tv.setState(new StateNeutral(tv));
        return "TV is off";
    }
}
