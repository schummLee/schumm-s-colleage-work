package schumm.gui;

import schumm.datasaves.dataArraylist;
import schumm.requirements.Student;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Secondnary extends JFrame implements ActionListener {
    public dataArraylist datalist;
    static ArrayList list1;
    static String name = "too";
    static JButton button = new JButton("LOOKTHROUGH");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Student und Teacher");
    JLabel label2 = new JLabel();
    JTextField jname = new JTextField(10);

    Secondnary() {
        this.setSize(600, 100);
        this.setTitle("content1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        Container con = this.getContentPane();
        con.setLayout(new FlowLayout());
        con.add(panel);
        panel.add(label);
        panel.add(button);
        panel.add(jname);
        panel.add(label2);
        button.addActionListener(this);
        datalist = new dataArraylist();
        list1 = datalist.getList();

    }


    @Override
    public void actionPerformed(ActionEvent e3) {
        if (e3.getSource() == button) {
            name = jname.getText();
            new dataArraylist();
            if(list1.contains(name)){
                label2.setText("yep");}


        }else if(!(list1.contains(name))) {
            label2.setText("none");
        }
    }

    public static void main(String arg[]) {


        new Secondnary();


    }
}