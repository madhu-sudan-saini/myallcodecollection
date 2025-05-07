class First
{
	private int rollno;
	private String name;
	private double marks;
	
	public First()
	{
		rollno=45;
		name="madhu sudan saini";
		marks=50.0;
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
		First f =new First();
		f.showdata();
	}
}
		
