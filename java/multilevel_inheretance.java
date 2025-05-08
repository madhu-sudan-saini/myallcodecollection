class A
{	
	public void show()
	{
		System.out.println("Class A called");
	}
}
class B extends A
{
	public void show()
	{
		super.show();
		System.out.println("Class B called");
	}
}
class C extends B
{
	public void show()
	{
		super.show();
		System.out.println("Class c called");
	}
}
class Demo
{
	public static void main(String args[])
	{	
		C obj=new C();
		obj.show();
	}
}	
