package zad3;

import java.util.Scanner;

public class Program implements Observable{
    Scanner myInput = new Scanner(System.in);
    private Observer observer;
    private int input;

    @Override
    public void addObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void deleteObserver() {
        this.observer = null;
    }

    @Override
    public void notifyObservers() {
        observer.update();
    }

    public int getInput(){
        return input;
    }

    public void changeInput(int input){
        this.input = input;
        if(input == 0){
            System.out.println("Jakich liczb szukamy:\n1. Większe od zero\n2. równe 3\n3.podzielne przez 2 : ");
            input = myInput.nextInt();
            if(input == 1){
                deleteObserver();
                addObserver(new GraterThenZero(this));
            }
            else if(input == 2){
                deleteObserver();
                addObserver(new EqualThree(this));
            }
            else if(input == 3){
                deleteObserver();
                addObserver(new DivisibleByTwo(this));
            }
        }
        notifyObservers();
    }
}
