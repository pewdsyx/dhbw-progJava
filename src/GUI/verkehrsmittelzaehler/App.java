package GUI.verkehrsmittelzaehler;


import javax.swing.*;
import java.awt.*;

public class App {

    public static JPanel makePanelWithButtons(int aFrom,int aTo,JLabel aLabel, String[] liste)
    {
        JPanel panel=new JPanel();
        for (int i=aFrom;i<aTo;i++)
        {
            String text=Integer.toString(i);
            JButton button=new JButton(text);
            button.addActionListener(new BListener(aLabel, liste[i]));
            panel.add(button);
        }

        return panel;
    }
    public static void main(String[] args) {
        JFrame frame=new JFrame("TestFrame");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JLabel label1 =new JLabel("Autos");
        label1.setFont(new Font("Arial",Font.PLAIN, 30));

        JLabel label2 =new JLabel("Fahrrad");
        label2.setFont(new Font("Arial",Font.PLAIN, 30));

        JLabel label3 =new JLabel("Fußgänger");
        label3.setFont(new Font("Arial",Font.PLAIN, 30));

        JPanel buttonPanel=makePanelWithButtons(1,4, label1,new String[] {"Auto","Fahrrad","Fußgänger"});
        frame.add(buttonPanel, BorderLayout.CENTER);


        frame.setVisible(true);
    }
}
