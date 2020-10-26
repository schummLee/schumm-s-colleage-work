package schumm.requirements;

import java.util.Scanner;

public class Student {

    private String no;
    private String name;
    private int java;
    Student(String no,String name,int java){
        this.no=no;
        this.name=name;
        this.java=java;
    }
    public Student(){}


    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getJava() {
        return java;
    }
    public void setJava(int java) {
        this.java = java;
    }
    public void print() {
        System.out.println("name"+getName()+"num"
                +getNo()+"score"+getJava());
    }


}