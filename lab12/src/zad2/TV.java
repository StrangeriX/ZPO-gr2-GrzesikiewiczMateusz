package zad2;

public class TV {
    private State state;
    private static boolean isOn = false;
    private final int maxChannels = 10;
    private int channel = 0;

    public TV(){
        this.state = new StateNeutral(this);
    }

    public String nextChannel(){
        channel++;
        if(channel > maxChannels){
            channel = 0;
        }
        return "Channel: "+channel;
    }
    public String prevChannel(){
        channel--;
        if(channel<0){
            channel = maxChannels;
        }
        return "Channel: "+channel;
    }

    public void setOn(boolean isOn){
        this.isOn = isOn;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isOn() {
        return isOn;
    }

    public State getState() {
        return state;
    }
}
