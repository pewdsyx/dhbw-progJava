package GUI.guiVotier.Malprogramm;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Paint");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MeinPanel(),BorderLayout.CENTER);
		frame.pack();
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		
		JPanel panel= new JPanel();
		
		MyButton blau= new MyButton("Blau");
		blau.setFont(new Font("Arial",Font.BOLD,20));
		blau.addActionListener(new MeinActionListener());
		panel.add(blau);
		
		MyButton rot= new MyButton("Rot");
		rot.setFont(new Font("Arial",Font.BOLD,20));
		rot.addActionListener(new MeinActionListener());
		panel.add(rot);
		
		MyButton schwach= new MyButton("Schwach");
		schwach.setFont(new Font("Arial",Font.BOLD,20));
		schwach.addActionListener(new MeinActionListener());
		panel.add(schwach);
		
		MyButton stark= new MyButton("Stark");
		stark.setFont(new Font("Arial",Font.BOLD,20));
		stark.addActionListener(new MeinActionListener());
		panel.add(stark);
		
		frame.add(panel,BorderLayout.NORTH);
		
		
		
		frame.setVisible(true);
	}

}
