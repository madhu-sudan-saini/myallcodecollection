class Student
{
	private int rollno;
	private String name;
	private double marks;
	
	public Student()
	{
		rollno=0;
		name="undefined";
		marks=0;
	}
	public Student(int rno,String nm,double m)
	{
		rollno=rno;
		name=nm;
		marks=m;
	}
	public void showdata()
	{
		System.out.println("rollno:"+rollno);
		System.out.println("name  :"+name);
		System.out.println("marks :"+marks);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Student f1 =new Student();
		f1.showdata();
		Student f2 =new Student(45,"ms saini",90.0);
		f2.showdata();
	}
}
		
