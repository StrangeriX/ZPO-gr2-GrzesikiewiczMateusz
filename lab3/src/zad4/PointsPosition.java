package zad4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PointsPosition extends JPanel implements Observer{
    private Panel panel;
    private ArrayList<Point> points;
    private JTextArea pointText = new JTextArea();

    public PointsPosition(Panel panel){
        this.panel = panel;
        this.points = new ArrayList<Point>();

        this.setBackground(Color.red);
        this.setSize(200,200);
        this.setLocation(60,70);
        add(pointText);
        this.setVisible(true);
    }

    @Override
    public void update() {
    this.points = panel.getPoints();
    for(var point:points){
        pointText.setText("Punkt: {"+point.x+";"+point.y+"}");
    }
    System.out.println(points);
    }
}
