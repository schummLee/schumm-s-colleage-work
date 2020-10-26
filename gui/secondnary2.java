package schumm.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import schumm.datasaves.dataArraylist;

public class secondnary2 extends JFrame implements ActionListener {
    public dataArraylist datalist2;
    static ArrayList list2;
    static String name;
    static boolean w;
    JPanel panel = new JPanel();
    JLabel label = new JLabel("this ist un command button");
    JButton button = new JButton("insert");
    JTextField jname = new JTextField(10);
    secondnary2(){
        this.setSize(600,100);
        this.setTitle("content2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());
        con.add(panel);
        panel.add(label);
        panel.add(button);
        panel.add(jname);
        button.addActionListener(this);
        datalist2 = new dataArraylist();
        list2 = datalist2.addElement(name);
    }


    @Override
    public void actionPerformed(ActionEvent e4) {
        if(e4.getSource()== button){
            name = jname.getText();
            list2 = datalist2.addElement(name);



        }
    }
    public static void main(String arg[]){
        new dataArraylist();

        new secondnary2();
    }
}
