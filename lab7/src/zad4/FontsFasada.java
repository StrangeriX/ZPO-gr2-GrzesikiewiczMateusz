package zad4;

public class FontsFasada {
    private Fonts bold;
    private Fonts italic;

    public FontsFasada(){
        this.bold = new Bold();
        this.italic = new Italic();
    }

    public void boldText(String text){
        bold.useFont(text);
    }
    public void italicText(String text){
        italic.useFont(text);
    }
}
