package GUI.guiVotier.Textersetzung;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Paint");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(800, 600);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		
		
		JTextArea area = new JTextArea();
		area.setFont(new Font("Arial",Font.BOLD,20));
		area.setBounds(20,20 ,760, 200);
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		frame.add(area);
		
		JTextPane d1 =new JTextPane();
		d1.setFont(new Font("Arial",Font.BOLD,40));
		d1.setBounds(150,260 ,200, 100);
		frame.add(d1);
		
		
		JTextPane d2 =new JTextPane();
		d2.setFont(new Font("Arial",Font.BOLD,40));
		d2.setBounds(450,260 ,200, 100);
		frame.add(d2);
		
		
		
		JButton ersetzen= new JButton("ersetzen");
		ersetzen.setBounds(100,400,600,50);
		ersetzen.setFont(new Font("Arial",Font.BOLD,20));
		ersetzen.addActionListener(new MeinActionListener(area,d1,d2));
		frame.add(ersetzen);
		
		
		
		frame.setVisible(true);
	}

}
