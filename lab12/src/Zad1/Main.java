package Zad1;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.drawLine().draw();
        System.out.println(editor.getState());
        editor.drawCircle().draw();
        editor.getState();
    }
}
