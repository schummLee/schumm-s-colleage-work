package schumm.gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import schumm.datasaves.dataArraylist;

public class secondnary4 extends JFrame {
    public dataArraylist datalist4;
    static ArrayList list4;
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JTextArea area = new JTextArea();
    JButton button = new JButton("checklist");
    secondnary4(){
        this.setSize(300,400);
        this.setTitle("content4");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());
        con.add(panel);
        panel.add(label);
        panel.add(button);
        panel.add(area);
        datalist4 = new dataArraylist();
        list4 = datalist4.getList();
        label.setText(list4.toString());
    }
    public static void main(String arg[]){
        new secondnary4();
        new dataArraylist();
    }
}

