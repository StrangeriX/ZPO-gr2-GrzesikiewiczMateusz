package zad4;

import javax.swing.*;
import java.awt.*;

public class PointsCounter extends JPanel implements Observer{
    private Panel panel;
    private int count;
    private JLabel label = new JLabel("Point count: "+ count);

    public PointsCounter(Panel panel){
        this.panel = panel;
        this.count = panel.getPointCount();
        add(label);
        this.setVisible(true);

    }

    @Override
    public void update() {
        this.count = panel.getPointCount();
        System.out.println("Updated, "+ count);
        label.setText("Point count: "+ count);
    }
}