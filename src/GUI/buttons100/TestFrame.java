package GUI.buttons100;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

public class TestFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("TestFrame");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label=new JLabel("Textausgabe");
		label.setFont(new Font("Arial",Font.PLAIN, 30));
		frame.add(label, BorderLayout.SOUTH);
		
		JButton neuerButton=new JButton("testbutton");
		neuerButton.setBackground(Color.red);
		frame.add(neuerButton, BorderLayout.EAST);

		JPanel buttonPanel=makePanelWithButtons(1,101, label);
		frame.add(buttonPanel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	public static JPanel makePanelWithButtons(int aFrom,int aTo,JLabel aLabel)
	{
		JPanel panel=new JPanel();
		for (int i=aFrom;i<aTo;i++)
		{
			String text=Integer.toString(i);
			JButton button=new JButton(text);
			button.addActionListener(new MeinButtonListener(aLabel, text));
			panel.add(button);
		}
		
		return panel;
	}

}
