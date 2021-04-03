package zad4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class Panel extends JPanel implements Observable{
    private Set<Observer> observers = new HashSet<>();
    private ArrayList<Point> points;
    private int pointCount = 0;

    public Panel(){
        points = new ArrayList<Point>();
        PointsCounter pc = new PointsCounter(this);
        addObserver(pc);

        PointsPosition pp = new PointsPosition(this);
        addObserver(pp);

        setPreferredSize(new Dimension(500,500));
        setBackground(Color.white);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                points.add(new Point(e.getX(), e.getY()));
                pointCount++;
                notifyObservers();
                repaint();
            }
        });

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (Point point : points){
            g2d.fillOval(point.x,point.y,10,10);

        }
        notifyObservers();
    }

    public int getPointCount() {
        return pointCount;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public Set<Observer> getObservers() {
        return observers;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
