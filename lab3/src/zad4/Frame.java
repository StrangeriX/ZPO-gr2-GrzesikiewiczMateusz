package zad4;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(){
        super("Points clicker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        setLocation(50,50);
        setLayout(new FlowLayout());


        Panel panel = new Panel();
        add(panel);
        PointsCounter pointsCounter = new PointsCounter(panel);
        add(pointsCounter);
        PointsPosition pointsPosition = new PointsPosition(panel);
        add(pointsPosition);
        panel.notifyObservers();
        pack();
        setVisible(true);

    }


}
