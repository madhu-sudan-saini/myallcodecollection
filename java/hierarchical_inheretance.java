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
class C extends A
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
		B obj1=new B();
		C obj2=new C();
	  obj1.show();
    obj2.show();

		
	}
}	
