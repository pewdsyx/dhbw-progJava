package GUI.guiVotier.Verkehrsteilnehmerzähler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class MyActionListener implements ActionListener {

	JLabel mLabel;
	
	JLabel rst1;
	JLabel rst2;
	JLabel rst3;
	
	public MyActionListener(JLabel a) {
		mLabel=a;
	}
	
	public MyActionListener(JLabel a,JLabel b,JLabel c)
	{
		rst1=a;
		rst2=b;
		rst3=c;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(rst1!=null)
		{
			rst1.setText("0");
			rst2.setText("0");
			rst3.setText("0");
		}
		else
		{
			char t=mLabel.getText().charAt(0);
			mLabel.setText(Character.getNumericValue(t)+1+"");
		}		
		
	}
}
