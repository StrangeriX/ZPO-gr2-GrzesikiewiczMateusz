package Zad1;

public class LineShape extends State{
    Editor editor;

    public LineShape(Editor editor){
        this.editor = editor;
    }

    @Override
    public void draw() {
        editor.setState(editor.getLineState());
        System.out.println("I draw line");
    }

}
