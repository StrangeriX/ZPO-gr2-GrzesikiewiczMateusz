package zad1;

import java.util.ArrayList;
import java.util.List;

public class DFSSearch implements SearchInterface{
    private Tree tree;
    private List<Node> nodes = new ArrayList<>();

    public DFSSearch(Tree tree){
        this.tree = tree;
        startSearchDFS(tree.root);
    }
    private void startSearchDFS(Node root){
        nodes.add(root);
        for(Node child : root.getChilds()){
            startSearchDFS(child);
        }
    }

    @Override
    public Iterator Iterate() {
        DFSIterator iterator = new DFSIterator();
        return iterator;
    }

    private class DFSIterator implements Iterator{
        private int position;

        @Override
        public boolean isNext() {
            if(position<nodes.size()){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.isNext()){
                return nodes.get(position+1).getData();
            }else{
                return null;
            }
        }
    }
}
