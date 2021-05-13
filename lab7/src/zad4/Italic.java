package zad4;

public class Italic implements Fonts{
    @Override
    public void useFont(String text) {
        System.out.println(text+" is italic now");
    }
}
