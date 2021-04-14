package zad3;

import java.util.Random;

public class HeightCommand implements Command{
    private Panel panel;
    public HeightCommand(Panel panel){
        this.panel = panel;
    }

    @Override
    public void execute() {
        Random r = new Random();

        panel.saveHeight(panel.getCorrectHeight());
        panel.setHeight(r.nextInt(400));
    }
}
