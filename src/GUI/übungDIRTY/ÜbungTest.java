package GUI.übungDIRTY;

import javax.swing.*;
import java.awt.*;

public class ÜbungTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");

        JLabel jl = new JLabel("Textausgabe");
        jl.setFont(new Font("Comic Sans MS",Font.PLAIN,30));

        JPanel jp = new JPanel();

        jb1.addActionListener(new Action1(jl));
        jb2.addActionListener(new Action2(jl));
        jb3.addActionListener(new Action3(jl));

        frame.add(jl,BorderLayout.SOUTH);

        /*frame.add(jb2,BorderLayout.NORTH);
        frame.add(jb3,BorderLayout.EAST);
        frame.add(jb1,BorderLayout.WEST);*/

        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);

        for (int i = 0; i <= 100;i++){
            String t = Integer.toString(i);
            JButton j = new JButton(t);
            j.addActionListener(new ActionUniver(jl,t));
            jp.add(j);

        }

        frame.add(jp,BorderLayout.CENTER);

        frame.setVisible(true);



    }
}
