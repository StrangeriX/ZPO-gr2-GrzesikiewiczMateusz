package zad3;

public class DivisibleByTwo implements Observer{
    private Program program;
    private int input;

    public DivisibleByTwo(Program program){
        this.program = program;
        this.input = program.getInput();
    }

    @Override
    public void update() {
        input = program.getInput();
        if(input%2 == 0){
            System.out.println("Podano liczbę podzielną przez 2: "+input);
        }
    }
}
