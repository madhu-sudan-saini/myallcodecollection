class First
{
	private int rollno;
	private String name;
	private double marks;
	
	public First(int rno,String nm ,double m)
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
		First f =new First(45,"madhu sudan saini",50.0);
		f.showdata();
	}
}
		
