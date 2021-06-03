package zad1;

import java.util.Scanner;

public class Keyboard implements IFile{
    @Override
    public int[] executeOperation(int[] ints) {
        Scanner s = new Scanner(System.in);
        for(int i=0;i<ints.length;i++){
            int newInt = s.nextInt();
            ints[i] = newInt;
        }
        return ints;
    }
}
