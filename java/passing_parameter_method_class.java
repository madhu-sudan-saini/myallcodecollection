import javax.swing.*;
class First
{
	private int rollno;
	private String name;
	
	public void setrollno(int rno)
	{
		rollno=rno;
	}
		public void setname(String nm)
	{
		name=nm;
	}
	public void showdata()
	{	
		System.out.println("roll no : "+rollno);
		System.out.println("name is :"+name);
	}
}
class Demo
{
	public static void main(String args[])
	{
		First f=new First();
		f.setrollno(101);
		f.setname("madhu sudan saini");
		f.showdata();
	}
}
		
