package zad1;

import java.util.Arrays;

public class FileFasade {
    private IFile sort;
    private IFile Keyboard;
    private IFile File;
    private int[] output;

    public FileFasade(int i){
        this.sort = new Sort();
        this.Keyboard = new Keyboard();
        this.File = new File();
        this.output = new int[i];
    }
    public void sortArray(){
        this.output = sort.executeOperation(output);
    }
    public void getFromKeyboard(){
        this.output = Keyboard.executeOperation(output);
    }
    public void getFromFile(){
        this.output = File.executeOperation(output);
    }
    public void print(){
        System.out.println(Arrays.toString(this.output));
    }
}
