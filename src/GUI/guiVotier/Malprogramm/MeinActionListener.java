package GUI.guiVotier.Malprogramm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeinActionListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getSource().toString()) {
		
			case "Blau" : MeinPanel.Colour=Color.BLUE; break;
				
			case "Rot" :	MeinPanel.Colour=Color.RED; break;
				
			case "Schwach" : if(MeinPanel.Strichstärke>3) {MeinPanel.Strichstärke-=3;} break;
				
			case "Stark" : MeinPanel.Strichstärke+=3;
		}
	}

	
}
