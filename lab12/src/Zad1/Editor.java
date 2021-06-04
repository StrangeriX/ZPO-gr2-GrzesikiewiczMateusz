package Zad1;

public class Editor {
    private State circle;
    private State line;
    private State state;

    public Editor(){
        this.circle = new CircleShape(this);
        this.line = new LineShape(this);
        this.state = null;
    }

    public void setState(State $state) {
        this.state = $state;
    }

    public State getState() {
        return state;
    }
    public State getLineState(){
        return this.line;
    }
    public State getCircleState(){
        return this.circle;
    }
    public State drawLine(){
        return this.line;
    }
    public State drawCircle(){
        return this.circle;
    }
}
