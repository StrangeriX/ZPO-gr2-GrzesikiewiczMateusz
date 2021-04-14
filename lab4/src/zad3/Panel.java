package zad3;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public static int height= 3;
    public static int width = 2;
    public static int color = 1;
    public static int none = 0;

    public int state = none;

    private int currentHeight = 100;
    private int lastHeight = currentHeight;
    private int currentWidth = 100;
    private int lastWidth = currentWidth;
    private Color currentColor = new Color(120, 50, 250);
    private Color lastColor = currentColor;

    public Panel(int width, int height){
        JFrame frame = new JFrame();
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        this.state = none;

        Button changeColor = new Button(new ColorCommand(this), "Color change");
        Button changeHeight = new Button(new HeightCommand(this), "Change height");
        Button undo = new Button(new UndoCommand(this), "Undo");


        JPanel sidebar = new SideBar();
        sidebar.add(changeColor);
        sidebar.add(changeHeight);
        sidebar.add(undo);

        this.setLocation(300,0);
        this.setSize(width, height);
        this.add(sidebar);
        this.setVisible(true);

        frame.add(this);
    }

    public int getCorrectHeight() {
        return currentHeight;
    }

    public int getCurrentWidth() {
        return currentWidth;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void setColor(Color color) {
        this.currentColor = color;
        this.repaint();
    }

    public void setHeight(int height) {
        this.currentHeight = height;
        this.repaint();
    }

    public void setWidth(int width) {
        this.currentWidth = width;
        this.repaint();
    }

    public void saveColor(Color color){
        this.state = Panel.color;
        this.lastColor = color;
    }
    public void saveWidth(int width){
        this.state = Panel.width;
        this.lastWidth = width;
    }
    public void saveHeight(int height){
        this.state = Panel.height;
        this.lastHeight = height;
    }

    public void undo(){
        if(this.state == color){
            this.currentColor = lastColor;
        }
        else if(this.state == height){
            this.currentHeight = lastHeight;
        }
        else if(this.state == width){
            this.currentWidth = lastWidth;
        }
        this.repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.clearRect(0,0,this.getCurrentWidth(),this.getCorrectHeight());
        int x = this.getCurrentWidth()/2;
        int y = this.getCorrectHeight()/2;

        g.setColor(currentColor);
        g.fillRect(x-currentWidth/2,y-currentHeight/2,currentWidth,currentHeight);
        g.dispose();
    }
}
