package zad4;

public class Bold implements Fonts{

    @Override
    public void useFont(String text) {
        System.out.println(text+" is bold now");
    }
}
