package schumm.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import schumm.datasaves.dataArraylist;

public class secondnary3 extends JFrame implements ActionListener {
    public dataArraylist datalist3;
    static ArrayList list3;
    static String name;
    static boolean w;
    static  boolean r;
    static int q = 0;
    JPanel panel = new JPanel();
    JLabel label = new JLabel("remove command");
    JButton button = new JButton("delete");
    JButton button2 = new JButton("which one");
    JTextField jname = new JTextField(10);
    JTextField jname2 = new JTextField(15);
    secondnary3(){
        this.setSize(600,100);
        this.setTitle("content3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());
        con.add(panel);
        panel.add(label);
        panel.add(button);
        panel.add(jname);
        panel.add(button2);
        panel.add(jname2);
        button.addActionListener(this);
        button2.addActionListener(this);
        datalist3 = new dataArraylist();
        list3 = datalist3.removeElement(q,name);

    }
    public static void main(String arg[]){
        new dataArraylist();

        new secondnary3();

    }

    @Override
    public void actionPerformed(ActionEvent e5) {
        if(e5.getSource()== button){
            name = jname.getText();
            w = true;
        }
        if(e5.getSource() == button2){
            q = Integer.parseInt(jname2.getText());
            r = true;

        }
    }
}
