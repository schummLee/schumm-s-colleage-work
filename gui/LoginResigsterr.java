package schumm.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLOutput;

import schumm.gui.Interface;
import schumm.gui.Leahschumm;

public class LoginResigsterr extends JFrame implements ActionListener{

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JButton button = new JButton("fassui");
    JButton button2 = new JButton("guon");
    public LoginResigsterr() {
        this.setSize(300, 300);
        this.setTitle("LOGIN/REGISTER");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con = this.getContentPane();
        con.setBackground(Color.BLUE) ; 
        con.setForeground(Color.RED);
        con.setLayout(new FlowLayout());
        panel.add(button);
        panel.add(button2);
        con.add(panel);
        this.setVisible(true);
        button.addActionListener(this);
        button2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button)
        {
            new Leahschumm();

        }
        else if(e.getSource()==button2)
        {
            new Resigster();

        }
    }

    public static void main(String arg[]){
        new LoginResigsterr();
}



}