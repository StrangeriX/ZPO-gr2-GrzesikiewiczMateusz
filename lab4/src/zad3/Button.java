package zad3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton {
    private Command command;

    public Button(Command command, String string){
        this.command = command;
        this.setText(string);

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                command.execute();
            }
        });
    }


    public void setCommand(Command command){
        this.command = command;
    }
}
