package zad2;

import java.util.ArrayList;

public class Account {
    private long balance;
    private ArrayList<Operation> operations = new ArrayList<Operation>();

    public void addOperation(Operation operation){
        operations.add(operation);
    }
}
