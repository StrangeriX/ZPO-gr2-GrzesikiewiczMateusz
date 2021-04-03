package zad3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int input;
        Program numberCheck = new Program();
        GraterThenZero gtz = new GraterThenZero(numberCheck);

        while(true){
        System.out.println("Podaj jakąś liczbę: ");
        input = myInput.nextInt();
        numberCheck.changeInput(input);
        }
    }
}
