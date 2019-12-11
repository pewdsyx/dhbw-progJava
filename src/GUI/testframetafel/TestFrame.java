package GUI.testframetafel;

import javax.swing.*;
import java.awt.*;


public class TestFrame{

    public static void main(String[] args) {

        //Fenster ohne Content:
        JFrame frame = new JFrame("test");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb = new JButton("ein Testbutton");
        JLabel jl = new JLabel("Textausgabe");
        jb.addActionListener(new MeinButtonListener(jl));


        frame.add(jl,BorderLayout.SOUTH);
        frame.add(jb,BorderLayout.NORTH);

        frame.setVisible(true);
    }

}
