package zad6;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ToolBarInterface{
    private String name;
    private List<ToolBarInterface> tools;

    public Menu(String name){
        this.name = name;
        this.tools = new ArrayList<>();
    }

    @Override
    public void print() {
        tools.forEach(ToolBarInterface::print);
    }
    public void addTools(ToolBarInterface newTool){
        tools.add(newTool);
    }
}
