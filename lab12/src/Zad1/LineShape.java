package Zad1;

public class LineShape extends State{
    Editor editor;

    public LineShape(Editor editor){
        this.editor = editor;
    }

    @Override
    public void draw() {
        System.out.println("I draw line");
    }

    @Override
    public State getShape() {
        editor.setState(this);
        return new LineShape();
    }
}
