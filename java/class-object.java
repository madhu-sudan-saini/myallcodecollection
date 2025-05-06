import javax.swing.*;
class Student
{
	private int rollno;
	private String name;
	private double marks;
	
	public void getdata()
	{
		rollno=Integer.parseInt(JOptionPane.showInputDialog("enter roll number"));
		name=JOptionPane.showInputDialog("enter name");
		marks=Integer.parseInt(JOptionPane.showInputDialog("enter marks"));
	
	}
	public void showdata()
	{
		System.out.println("roll number is :"+rollno);
		System.out.println("roll name is :"+name);
		System.out.println("roll marks is :"+marks);
	}
}
class StudentTest
{
	public static void main(String args[])
	{
		Student obj=new Student();
		obj.getdata();	
		obj.showdata();
	}
}
		
