package zad1;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String data = null;
    private List<Node> childs = new ArrayList<>();
    private Node parent = null;

    public Node(String data){
        this.data = data;
    }
    public Node addChild(Node child){
        this.childs.add(child);
        child.setParent(this);
        return child;
    }
    private void setParent(Node parent){
        this.parent = parent;
    }
    public String getData(){
        return data;
    }
    public List<Node> getChilds(){
        return childs;
    }
}
