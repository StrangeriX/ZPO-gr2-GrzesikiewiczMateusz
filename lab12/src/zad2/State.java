package zad2;

public abstract class State {
    TV tv;

    State(TV tv){
        this.tv = tv;
    }

    public abstract String onStateOn();
    public abstract String onStateOff();
    public abstract String onStateNext();
    public abstract String onStatePrev();
}
