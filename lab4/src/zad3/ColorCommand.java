package zad3;

import java.awt.*;
import java.util.Random;

public class ColorCommand implements Command{
    private Panel panel;

    public ColorCommand(Panel panel){
        this.panel = panel;
    }

    @Override
    public void execute() {
        Random random = new Random();

        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        Color color = new Color(r,g,b);

        panel.saveColor(panel.getCurrentColor());
        panel.setColor(color);

    }
}
