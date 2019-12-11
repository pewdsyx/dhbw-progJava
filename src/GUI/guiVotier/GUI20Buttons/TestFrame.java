package GUI.guiVotier.GUI20Buttons;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestFrame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("TestFrame");
		
		
		frame.setSize(1000,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		
		
		JButton button1= new JButton("1");
		button1.setFont(new Font("Arial",Font.BOLD,50));
		
		
		
		JButton button2= new JButton("2");
		button2.setFont(new Font("Arial",Font.BOLD,50));
		

		
		JButton button3= new JButton("3");
		button3.setFont(new Font("Arial",Font.BOLD,50));
		
		
		
		JLabel label= new JLabel("Testausgabe");
		label.setFont(new Font("Arial",Font.BOLD,50));
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		
		//frame.add(button2,BorderLayout.NORTH);
		//frame.add(button1,BorderLayout.WEST);
		//frame.add(button3,BorderLayout.EAST);
		//frame.add(label,BorderLayout.CENTER);
		
		
		
		JPanel panel = new JPanel();
		
		//JPanel hat den Fluss Layout Manager
		//JPanel hat den Border Layout Manager
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		
		
		frame.add(panel,BorderLayout.CENTER);
		
		button1.addActionListener(new MeinButtonListener(label,"1"));
		button2.addActionListener(new MeinButtonListener(label,"2"));
		button3.addActionListener(new MeinButtonListener(label,"3"));
		
		
		
		frame.setVisible(true);
	}

}
