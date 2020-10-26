package schumm.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Resigster extends JFrame implements ActionListener {
    static String name;
    static String pwd;
    JButton button=new JButton("R");
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPasswordField jpassword=new JPasswordField(10);
    JTextField jname=new JTextField(10);
    JPasswordField jpassword2=new JPasswordField(10);
    Resigster(){
        this.setTitle("Resigster hh");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.cyan);
        Container con=this.getContentPane();
        con.setLayout(new GridLayout(5,1));
        con.add(panel1);
        con.add(panel2);
        panel1.add(button);
        this.setVisible(true);
        panel1.add(jname);
        panel2.add(jpassword2);
        panel2.add(jpassword);
        con.add(panel1);
        con.add(panel2);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            name=jname.getText();
            char c[]=jpassword.getPassword();
            pwd=new String(c);
            if(jpassword == jpassword2){
            new Leahschumm();}}
    }
    public static void main(String arg[]){

        new Resigster();
    }
}
