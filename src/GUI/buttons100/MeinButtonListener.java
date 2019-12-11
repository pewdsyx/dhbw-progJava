package GUI.buttons100;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class MeinButtonListener implements ActionListener {

	JLabel mLabel;
	String mText;
	
	public MeinButtonListener(JLabel aLabel,String aText) {
		mLabel=aLabel;
		mText=aText;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("der button wurde gedr�ckt");
		mLabel.setText(mText);
		JButton button=(JButton)arg0.getSource();
		button.setBackground(Color.red);
	}

}
