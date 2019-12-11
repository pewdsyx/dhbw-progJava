package GUI.testframetafel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeinButtonListener implements ActionListener{

    JLabel mLabel;

    public MeinButtonListener(JLabel aLabel){
        this.mLabel = aLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mLabel.setText("das ist ein neuer text");
    }
}
