package zad3;

public class Rectangle implements Shape{
    @Override
    public void draw(int x, int y, int z, int a) {
        System.out.println("Print rectangle from: ("+x+", "+y+"). Width:"+z+", Height: "+a);
    }
}
