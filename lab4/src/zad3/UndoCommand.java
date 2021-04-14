package zad3;

public class UndoCommand implements Command{
    private Panel panel;

    public UndoCommand(Panel panel){
        this.panel = panel;
    }

    @Override
    public void execute() {
        panel.undo();
    }
}
