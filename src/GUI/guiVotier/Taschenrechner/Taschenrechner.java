package GUI.guiVotier.Taschenrechner;


import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Taschenrechner {

		static JFrame frame;
		
		public static void main(String[] args) {


			frame= new JFrame("Z�hler");
			frame.setLayout(null);
			CreateParts(frame);
			frame.setSize(500,600);
			frame.setLocationRelativeTo(null);
			
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}

		
		public static void CreateParts(JFrame x) {
			
			JTextPane output= new JTextPane();
			output.setBounds(30,10,420,80);
			output.setFont(new Font("Arial",Font.BOLD,50));
			output.setEditable(false);
			x.add(output);
					
			
			MyButton b1= new MyButton("1");
			b1.setFont(new Font("Arial",Font.BOLD,40));
			b1.setBackground(Color.BLUE);
			b1.setForeground(Color.WHITE);
			b1.setBounds(30, 320, 90, 90);
			b1.addActionListener(new MyActionListener(output));
			x.add(b1);
			
			MyButton b2= new MyButton("2");
			b2.setFont(new Font("Arial",Font.BOLD,40));
			b2.setBackground(Color.BLUE);
			b2.setForeground(Color.WHITE);
			b2.setBounds(140, 320, 90, 90);
			b2.addActionListener(new MyActionListener(output));
			x.add(b2);
			
			MyButton b3= new MyButton("3");
			b3.setFont(new Font("Arial",Font.BOLD,40));
			b3.setBackground(Color.BLUE);
			b3.setForeground(Color.WHITE);
			b3.setBounds(250, 320, 90, 90);
			b3.addActionListener(new MyActionListener(output));
			x.add(b3);
			
			MyButton b4= new MyButton("4");
			b4.setFont(new Font("Arial",Font.BOLD,40));
			b4.setBackground(Color.BLUE);
			b4.setForeground(Color.WHITE);
			b4.setBounds(30, 210, 90, 90);
			b4.addActionListener(new MyActionListener(output));
			x.add(b4);
			
			MyButton b5= new MyButton("5");
			b5.setFont(new Font("Arial",Font.BOLD,40));
			b5.setBackground(Color.BLUE);
			b5.setForeground(Color.WHITE);
			b5.setBounds(140, 210, 90, 90);
			b5.addActionListener(new MyActionListener(output));
			x.add(b5);
			
			MyButton b6= new MyButton("6");
			b6.setFont(new Font("Arial",Font.BOLD,40));
			b6.setBackground(Color.BLUE);
			b6.setForeground(Color.WHITE);
			b6.setBounds(250, 210, 90, 90);
			b6.addActionListener(new MyActionListener(output));
			x.add(b6);
			
			MyButton b7= new MyButton("7");
			b7.setFont(new Font("Arial",Font.BOLD,40));
			b7.setBackground(Color.BLUE);
			b7.setForeground(Color.WHITE);
			b7.setBounds(30, 100, 90, 90);
			b7.addActionListener(new MyActionListener(output));
			x.add(b7);
			
			MyButton b8= new MyButton("8");
			b8.setFont(new Font("Arial",Font.BOLD,40));
			b8.setBackground(Color.BLUE);
			b8.setForeground(Color.WHITE);
			b8.setBounds(140, 100, 90, 90);
			b8.addActionListener(new MyActionListener(output));
			x.add(b8);
			
			MyButton b9= new MyButton("9");
			b9.setFont(new Font("Arial",Font.BOLD,40));
			b9.setBackground(Color.BLUE);
			b9.setForeground(Color.WHITE);
			b9.setBounds(250, 100, 90, 90);
			b9.addActionListener(new MyActionListener(output));
			x.add(b9);
			
			MyButton b0= new MyButton("0");
			b0.setFont(new Font("Arial",Font.BOLD,40));
			b0.setBackground(Color.BLUE);
			b0.setForeground(Color.WHITE);
			b0.setBounds(140, 430, 90, 90);
			b0.addActionListener(new MyActionListener(output));
			x.add(b0);
			
			MyButton bGleich= new MyButton("=");
			bGleich.setFont(new Font("Arial",Font.BOLD,40));
			bGleich.setBackground(Color.BLUE);
			bGleich.setForeground(Color.WHITE);
			bGleich.setBounds(250, 430, 90, 90);
			bGleich.addActionListener(new MyActionListener(output));
			x.add(bGleich);
			
			MyButton bDEL= new MyButton("CE");
			bDEL.setFont(new Font("Arial",Font.BOLD,40));
			bDEL.setBackground(Color.BLUE);
			bDEL.setForeground(Color.WHITE);
			bDEL.setBounds(30, 430, 90, 90);
			bDEL.addActionListener(new MyActionListener(output));
			x.add(bDEL);
			
			MyButton bDiv= new MyButton("/");
			bDiv.setFont(new Font("Arial",Font.BOLD,40));
			bDiv.setBackground(Color.BLUE);
			bDiv.setForeground(Color.WHITE);
			bDiv.setBounds(360, 100, 90, 90);
			bDiv.addActionListener(new MyActionListener(output));
			x.add(bDiv);
			
			MyButton bMal= new MyButton("*");
			bMal.setFont(new Font("Arial",Font.BOLD,40));
			bMal.setBackground(Color.BLUE);
			bMal.setForeground(Color.WHITE);
			bMal.setBounds(360, 210, 90, 90);
			bMal.addActionListener(new MyActionListener(output));
			x.add(bMal);
			
			MyButton bSub= new MyButton("-");
			bSub.setFont(new Font("Arial",Font.BOLD,40));
			bSub.setBackground(Color.BLUE);
			bSub.setForeground(Color.WHITE);
			bSub.setBounds(360, 320, 90, 90);
			bSub.addActionListener(new MyActionListener(output));
			x.add(bSub);
			
			MyButton bAdd= new MyButton("+");
			bAdd.setFont(new Font("Arial",Font.BOLD,40));
			bAdd.setBackground(Color.BLUE);
			bAdd.setForeground(Color.WHITE);
			bAdd.setBounds(360, 430, 90, 90);
			bAdd.addActionListener(new MyActionListener(output));
			x.add(bAdd);
		}
}
