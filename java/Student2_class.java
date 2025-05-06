import javax.swing.*;

class Student {
    private int rollno;
    private String name;
    private double physics;
    private double chemistry;
    private double math;
    private double total;

    public void getdata() {
        rollno = Integer.parseInt(JOptionPane.showInputDialog("Enter roll number"));
        name = JOptionPane.showInputDialog("Enter name");
        physics = Double.parseDouble(JOptionPane.showInputDialog("Enter marks in Physics"));
        chemistry = Double.parseDouble(JOptionPane.showInputDialog("Enter marks in Chemistry"));
        math = Double.parseDouble(JOptionPane.showInputDialog("Enter marks in Math"));
    }

    public void calculateresult() {
        total = ((physics + chemistry + math) / 300) * 100;
    }

    public void showdata() {
        System.out.println("Roll number : " + rollno);
        System.out.println("Name        : " + name);
        System.out.println("Physics     : " + physics);
        System.out.println("Chemistry   : " + chemistry);
        System.out.println("Math        : " + math);
        System.out.printf("Percentage  : %.2f%%\n", total);
        System.out.println("-----------------------------------");
    }
}

public class StudentTest {
    public static void main(String args[]) {
        Student[] s = new Student[3];

        for (int i = 0; i < 3; i++) {
            s[i] = new Student();
            s[i].getdata();
            s[i].calculateresult();
        }

        for (int i = 0; i < 3; i++) {
            s[i].showdata();
        }
    }
}
