package zad3;


public class Line implements Shape {

    @Override
    public void draw(int x, int y, int z, int a) {
        System.out.println("Print line from: ("+x+", "+y+")"+ "to: ("+z+", "+a+")");
    }
}
