package schumm.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JButton button = new JButton("SUBJECT 1");
    JButton button2 = new JButton("SUBJECT 2");
    JButton button3 = new JButton("SUBJECT 3");
    JButton button4 = new JButton("SUBJECT 4");

   public Interface() {
        this.setSize(300, 400);
        this.setTitle("LOGIN/REGISTER");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());
        con.setLayout(new GridLayout(1,1));
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        con.add(panel);
        this.setVisible(true);
        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this); 
    }
    public static void main(String arg[]){
        new Interface();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button)
        {
            new Secondnary();

        }
        else if (e.getSource()==button2)
        {
            new secondnary2();
        }
        else if (e.getSource()==button3)
        {
            new secondnary3();
        }
        else if (e.getSource()==button4)
        {
            new secondnary4();
        }
    }
}
