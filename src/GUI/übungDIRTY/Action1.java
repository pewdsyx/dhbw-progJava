package GUI.übungDIRTY;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action1 implements ActionListener {

    JLabel mLabel;

    public Action1(JLabel aLabel){
        this.mLabel = aLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mLabel.setText("1");
    }
}
