package GUI.übungDIRTY;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionUniver implements ActionListener {

    JLabel mLabel;
    String mText;

    public ActionUniver(JLabel aLabel,String aText){
        this.mLabel = aLabel;
        this.mText = aText;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mLabel.setText(this.mText);
    }
}
