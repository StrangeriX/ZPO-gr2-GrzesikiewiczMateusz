package zad3;

public class GraterThenZero implements Observer{
    private Program program;
    private int input;

    public GraterThenZero(Program program){
        this.program = program;
        this.input = program.getInput();
    }
    @Override
    public void update() {
        input = program.getInput();
        if(input > 0){
        System.out.println("Nwa podana liczba większa od 0 to: "+input);
    }
    }
}
