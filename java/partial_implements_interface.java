interface First
{
	void show();
	void display();
}

abstract class Abc implements First
{
	public void show()
	{
		System.out.println("show is called");
	}
}

class Child extends Abc
{
	public void display()
	{
		System.out.println("display is called");
	}
}

class Demo
{
	public static void main(String args[])
	{
		Child obj = new Child();
		obj.show();
		obj.display();
	}
}
