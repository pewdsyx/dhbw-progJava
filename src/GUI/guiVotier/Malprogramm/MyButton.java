package GUI.guiVotier.Malprogramm;

import javax.swing.JButton;

public class MyButton extends JButton {

		public MyButton(String aText) {
			super(aText);
		}
		
		@Override
		public String toString()
		{
			return super.getText();
		}
}
