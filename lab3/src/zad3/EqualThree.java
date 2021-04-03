package zad3;

public class EqualThree implements Observer{
    private Program program;
    private int input;

    public EqualThree(Program program){
        this.program = program;
        this.input = program.getInput();
    }

    @Override
    public void update() {
        input = program.getInput();
        if(input == 3){
            System.out.println("Podano liczbę równą 3");
        }
    }
}
