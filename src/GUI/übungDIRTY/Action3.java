package GUI.übungDIRTY;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action3 implements ActionListener {

    JLabel mLabel;

    public Action3(JLabel aLabel){
        this.mLabel = aLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mLabel.setText("3");
    }
}
