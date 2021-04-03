package zad2;

public class InterestChange implements Operation{
    Account acc;
    Interest interest;

    public InterestChange(Account account, Interest interest){
        this.acc = account;
        this.interest = interest;
    }

    @Override
    public void execute() {

    }
}
