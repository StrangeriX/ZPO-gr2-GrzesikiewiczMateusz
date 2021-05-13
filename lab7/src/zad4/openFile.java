package zad4;

import java.util.Scanner;

public class openFile {
    String text;
    FontsFasada fontsFasada;

    public openFile(String text){
        this.text = text;
        this.fontsFasada = new FontsFasada();
    }

    public void changeFont(){
        Scanner s = new Scanner(System.in);
        System.out.println("bold or italic??");
        String font = s.nextLine();
        if(font.equals("bold")){
            fontsFasada.boldText(this.text);
        }
        else if(font.equals("italic")){
            fontsFasada.italicText(this.text);
        }
        else{
            System.out.println("Wrong font");
        }
    }
}
