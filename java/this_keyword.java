class Student
{
	private int rollno;
	private String name;
	private double marks;
	
	public Student(int rollno,String name,double marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	public void show()
	{
		System.out.println("roll no. :"+rollno);
		System.out.println("name :"+name);
		System.out.println("marks :"+marks);
	}
} 
class Demo
{
	public static void main(String args[])
	{
		Student s=new Student(101,"madhu sudan saini",100);
		s.show();
	}
}
