package GUI.guiVotier.Verkehrsteilnehmerzähler;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Counter {

	static JFrame frame;
	
	public static void main(String[] args) {


		frame= new JFrame("Z�hler");
		frame.setLayout(null);
		CreateParts(frame);
		frame.setSize(600,500);
		frame.setLocationRelativeTo(null);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public static void CreateParts(JFrame x) {
		
		JLabel lbl1= new JLabel("0");
		lbl1.setBounds(300,315,500,100);
		lbl1.setFont(new Font("Arial",Font.BOLD,40));
		x.add(lbl1);
		
		JLabel lbl2= new JLabel("0");
		lbl2.setBounds(250,80,500,100);
		lbl2.setFont(new Font("Arial",Font.BOLD,40));
		x.add(lbl2);
		
		JLabel lbl3= new JLabel("0");
		lbl3.setBounds(250,200,500,100);
		lbl3.setFont(new Font("Arial",Font.BOLD,40));
		x.add(lbl3);
		
		JLabel lbl4= new JLabel("Counter");
		lbl4.setBounds(200,5,500,70);
		lbl4.setFont(new Font("Arial",Font.BOLD,50));
		x.add(lbl4);
				
		
		
		JButton btn1= new JButton("Fu�g�nger");
		btn1.setFont(new Font("Arial",Font.BOLD,30));
		btn1.setBackground(Color.GRAY);
		btn1.setForeground(Color.white);
		btn1.setBounds(20, 80, 200, 100);
		btn1.addActionListener(new MyActionListener(lbl2));
		x.add(btn1);
		
		JButton btn2= new JButton("Autos");
		btn2.setFont(new Font("Arial",Font.BOLD,30));
		btn2.setBackground(Color.GRAY);
		btn2.setForeground(Color.white);
		btn2.setBounds(20, 200, 200, 100);
		btn2.addActionListener(new MyActionListener(lbl3));
		x.add(btn2);
		
		JButton btn3= new JButton("Fahrradfahrer");
		btn3.setFont(new Font("Arial",Font.BOLD,30));
		btn3.setBackground(Color.GRAY);
		btn3.setForeground(Color.white);
		btn3.setBounds(20, 320, 250, 100);
		btn3.addActionListener(new MyActionListener(lbl1));
		x.add(btn3);
		
		JButton Reset= new JButton("R");
		Reset.setFont(new Font("Arial",Font.BOLD,20));
		Reset.setBackground(Color.RED);
		Reset.setForeground(Color.BLACK);
		Reset.setBounds(500, 370, 50, 50);
		Reset.addActionListener(new MyActionListener(lbl1,lbl2,lbl3));
		x.add(Reset);
	}
}
