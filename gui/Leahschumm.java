package schumm.gui;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public  class Leahschumm extends JFrame implements ActionListener{



    JPanel jp1=new JPanel();
    JPanel jp2=new JPanel();
    JPanel jp3=new JPanel();
    JPanel jp4=new JPanel();
    JPanel jp5=new JPanel();
    JButton jb1=new JButton("Fire");
    JButton jb2=new JButton("waht");
    JLabel jlab1=new JLabel("love");
    JLabel i1ab2=new JLabel("lemur");
    JLabel jlab3=new JLabel("giralla");
    JLabel jlab4=new JLabel();
    JLabel jlab5=new JLabel();
    JPasswordField jpass=new JPasswordField(10);
    JTextField jname=new JTextField(10);
    JTextField jyzm=new JTextField(6);
    String yzm="";
    Leahschumm(){
        this.setTitle("piggy");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container con=this.getContentPane();
        con.setLayout(new GridLayout(5,1));
        jp1.add(jlab1);jp1.add(jname);
        jp2.add(i1ab2) ;jp2.add(jpass);
        jp3.add(jlab3) ;jp3.add(jyzm);jp3.add(jlab4);
        jp4.add(jb1);jp4.add(jb2);
        jp5.add(jlab5);
        con.add(jp1);
        con.add(jp2);
        con.add(jp3 );
        con.add(jp4);
        con.add(jp5);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        yzm=this.getYzm(4);
        jlab4.setText(yzm);
        this.setVisible(true);
    }
    public String getYzm(int n) {
        String s="";
        String string = "0123456789abcdefg";
        char[] ch = new char[n];
        for(int i = 0;i<n;i++) {
            Random random = new Random();
            int index = random.nextInt(string.length());
            ch[i] = string.charAt(index);
        }
        String result = String.valueOf(ch);
        return result;

    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==jb1) {
            String name=jname.getText();
            char c[]=jpass.getPassword();
            String pwd=new String(c);
            String useryzm=jyzm.getText();
            if(!name.equals(Resigster.name)||!pwd.equals(Resigster.pwd)) {
                jlab5.setText("sometext");
                new Interface();
            }else if(!useryzm.equals(yzm)) {
                jlab5.setText("othertext");
            }
        }else if(arg0.getSource()==jb2);{
            jname.setText("");
            jpass.setText("");
            jyzm.setText("");
        }
    }
    public static void main(String arg[]) {
        new Leahschumm();

    }
}


