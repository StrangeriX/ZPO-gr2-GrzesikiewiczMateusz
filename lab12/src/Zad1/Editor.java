package Zad1;

public class Editor {
    private State circle;
    private State line;
    private State state;

    public Editor(){
        this.circle = new CircleShape();
        this.line = new LineShape();
    }

    public void setState(State $state) {
        this.state = $state;
    }

    public State getState() {
        return state;
    }
    public State drawLine(){
        return this.line;
    }
    public State drawCircle(){
        return this.circle;
    }
}
