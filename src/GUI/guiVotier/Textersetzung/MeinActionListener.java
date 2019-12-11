package GUI.guiVotier.Textersetzung;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class MeinActionListener implements ActionListener{

	JTextArea mArea;
	JTextPane md1;
	JTextPane md2;
	
	public MeinActionListener(JTextArea area, JTextPane d1, JTextPane d2) {

		mArea=area;
		md1=d1;
		md2=d2;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String text= mArea.getText();
	
		for(int x=0;x<text.length();x++)
		{
			text=text.replace(md1.getText(),md2.getText());
		}

		mArea.setText(text);
	}

	//Returns the index within this string of the first (or last) occurrence of the specified substring [searching forward (or backward) starting at the specified index].
}
