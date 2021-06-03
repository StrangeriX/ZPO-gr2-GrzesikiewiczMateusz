package zad1;

import java.util.ArrayList;
import java.util.List;

public class BFSSearch implements SearchInterface{
    private Tree tree;
    private List<Node> nodes = new ArrayList<>();

    public BFSSearch(Tree tree){
        this.tree = tree;
        startSearchBFS(tree.root);
    }
    private void startSearchBFS(Node node){
        List<Node> nodes = new ArrayList<>();
        nodes.add(node);
        while(!nodes.isEmpty()){
            Node tmp = nodes.get(0);
            nodes.add(tmp);
            nodes.remove(0);
            nodes.addAll(tmp.getChilds());
        }
    }

    @Override
    public Iterator Iterate() {
        BFSIterator iterator = new BFSIterator();
        return iterator;
    }
    private class BFSIterator implements Iterator{
        private int position;


        @Override
        public boolean isNext() {
            if(position < nodes.size()){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.isNext()){
                return nodes.get(position+1).getData();
            }else {
                return null;
            }
        }
    }

}
