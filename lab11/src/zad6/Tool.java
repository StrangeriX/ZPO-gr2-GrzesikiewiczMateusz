package zad6;

public class Tool implements ToolBarInterface{
    private String name;
    public Tool(String name){
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(this.name);
    }
}
