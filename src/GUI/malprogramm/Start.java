package GUI.malprogramm;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Paint");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MeinPanel(),BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}
