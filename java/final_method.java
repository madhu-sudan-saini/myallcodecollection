class A
{
	public final void show()
	{	
		System.out.println("show is called");
	}
	public void display()
	{
		System.out.println("display of parent is called");
	}
}
class B extends A
{
	public void display()
	{
		super.display();
		System.out.println("display of child is called");
	}
}
class Demo
{
	public static void main(String args[])
	{
		B obj =new B();
		obj.show();
		obj.display();
	}
}
