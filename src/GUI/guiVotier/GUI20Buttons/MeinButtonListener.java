package GUI.guiVotier.GUI20Buttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MeinButtonListener implements ActionListener {

	JLabel Label;
	String mOutputText;
	
	
	public MeinButtonListener(JLabel aLabel, String aOutputText) {
		Label=aLabel;
		mOutputText=aOutputText;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Label.setText(mOutputText);
	}

	
}
