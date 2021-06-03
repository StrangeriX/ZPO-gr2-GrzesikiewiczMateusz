package zad1;

public class TreeCollection {
    Iterator iterator;
    Tree tree;

    public TreeCollection(Tree tree){
        this.tree = tree;
    }
    public void selectBFSIterator(){
        SearchInterface bfs = new BFSSearch(this.tree);
        this.iterator = bfs.Iterate();
    }
    public void selectDFSIterator(){
        SearchInterface dfs = new DFSSearch(this.tree);
        this.iterator = dfs.Iterate();
    }
    public void display(){
        while(this.iterator.isNext()){
            Object object = this.iterator.next();
            System.out.println(object);
        }
        System.out.println("\n");
    }

}
