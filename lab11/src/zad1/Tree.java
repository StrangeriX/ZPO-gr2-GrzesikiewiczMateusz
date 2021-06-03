package zad1;

import java.io.File;

public class Tree {
    public Node root;

    public Tree(Node root){
        this.root = root;
    }

    public Node startTree(File nodeData, Node parent){
        if(nodeData.isDirectory()){
            String[] subNode = nodeData.list();
            for(String data : subNode){
                Node nextParent = new Node(data);
                parent.addChild(nextParent);
                startTree(new File(data, data), nextParent);
            }
        }
        return parent;
    }
}
