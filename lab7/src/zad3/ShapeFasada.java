package zad3;

public class ShapeFasada {
    private Shape rectangle;
    private Shape line;

    public ShapeFasada(){
        rectangle = new Rectangle();
        line  = new Line();
    }

    public void printLine(int x, int y,int z, int a){
        line.draw(x,y,z,a);
    }
    public void printRectangle(int x, int y, int z, int a){
        rectangle.draw(x,y,z,a);
    }
}
