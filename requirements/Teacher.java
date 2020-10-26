package schumm.requirements;

import schumm.requirements.Student;

import java.util.Scanner;

public class Teacher {

    public void inputInfo(Student[] st) {
        Scanner key = new Scanner(System.in);
        for (int i = 0; i < st.length; i++) {
            System.out.println("plz in put name");
            String name = key.next();
            System.out.println("plz input num");
            String no = key.next();
            System.out.println("plz input score");
            int java = key.nextInt();
            st[i] = new Student(no,name,java);

        }
        key.close();
    }

    public void printAll(Student[] st) {
        for (Student s : st) {
            s.print();
        }

    }


    public double getAve(Student[] st) {
        double sum=0;
        for(int i=0;i<st.length;i++) {
            sum=sum+st[i].getJava();
        }

        for(Student s:st) {
            sum=sum+s.getJava();
        }
        return sum/st.length;
    }

    public int getMax(Student[] st) {
        int max=st[0].getJava();
        for(int i=0;i<st.length;i++) {
            if(max<st[i].getJava())
                max=st[i].getJava();
        }
        for(Student s:st) {
            if(max<s.getJava())
                max=s.getJava();
        }
        return max;
    }

    public int getMin(Student[] st) {
        return 0;
    }

}