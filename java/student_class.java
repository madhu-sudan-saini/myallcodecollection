import javax.swing.*;
class Student
{
	private int rollno;
	private String name;
	private double physics;
	private double chemistry;
	private double math;
	private double total;
	
	public void getdata()
	{
		rollno=Integer.parseInt(JOptionPane.showInputDialog("enter roll number"));
		name=JOptionPane.showInputDialog("enter name");
		physics=Integer.parseInt(JOptionPane.showInputDialog("enter marks physics"));
		chemistry=Integer.parseInt(JOptionPane.showInputDialog("enter marks chemistry"));
		math=Integer.parseInt(JOptionPane.showInputDialog("enter marks math"));
	}
	public void calculateresult()
	{
		total=((physics+chemistry+math)/300)*100;
	}
	public void showdata()
	{
		System.out.println("roll number :"+rollno);
		System.out.println(" name :"+name);
		System.out.println("physics marks :"+physics);
		System.out.println("chemistry marks :"+chemistry);
		System.out.println("math marks :"+math);
		System.out.println("percentage  :"+total);
	}
}
class StudentTest
{
	public static void main(String args[])
	{
		Student obj=new Student();
		obj.getdata();
		obj.calculateresult();	
		obj.showdata();
	}
}
		
