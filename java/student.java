import javax.swing.*;
public class student {
    private String name;
    private int rollno;

    public void getdata() {
        name = JOptionPane.showInputDialog("Enter your name");
        rollno = Integer.parseInt(JOptionPane.showInputDialog("Enter your roll number"));
    }

    public void showdata() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
    }
}
	
class Demo
{
    public static void main(String[] args) {
        First obj = new First();  
        obj.getdata();           
        obj.showdata();           
    }
}
