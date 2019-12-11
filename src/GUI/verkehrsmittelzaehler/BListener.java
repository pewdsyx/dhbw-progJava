package GUI.verkehrsmittelzaehler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BListener implements ActionListener {
    JLabel mLabel;
    String mText;
    int counter;

    public BListener(JLabel aLabel,String aZählbarObjekt) {
        this.mLabel=aLabel;
        this.mText = aZählbarObjekt;
        this.counter = 0;
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("Der plus1 Button für " + this.mText + " wurde gedrückt");
        counter++;
        this.mText += " " + counter;
        mLabel.setText(mText);
    }
}
