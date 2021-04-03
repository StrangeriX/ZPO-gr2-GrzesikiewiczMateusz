package zad2;

public class Transfer implements Operation{
    Account from;
    Account to;

    public Transfer(Account from, Account to){
        this.from = from;
        this.to = to;
    }

    @Override
    public void execute() {

    }
}
