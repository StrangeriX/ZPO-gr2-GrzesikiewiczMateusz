package Zad1;

public class CircleShape extends State{
    @Override
    public void draw() {
        System.out.println("I draw circle");
    }

    @Override
    public State getShape() {
        return new CircleShape();
    }
}
