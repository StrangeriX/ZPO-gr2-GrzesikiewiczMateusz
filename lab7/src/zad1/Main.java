package zad1;

public class Main {
    public static void main(String[] args) {
        FileFasade fs = new FileFasade(5);
        fs.getFromKeyboard();
        fs.print();
        fs.sortArray();
        fs.print();
    }
}
