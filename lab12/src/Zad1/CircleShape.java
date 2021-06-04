package Zad1;

public class CircleShape extends State{
    Editor editor;
    public CircleShape(Editor editor){
        this.editor = editor;
    }
    @Override
    public void draw() {
        editor.setState(editor.getCircleState());
        System.out.println("I draw circle");
    }
}
