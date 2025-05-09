interface First
{
	void show();
	void display();
}
interface Second
{
	void fun();
}

class Test implements  First , Second
{
	public void show()
	{	
		System.out.println("show is called");
	}
	public void display()
	{	
		System.out.println("display is called");
	}
	public void fun()
	{	
		System.out.println("fun is called");
	}
}
class  Demo
{
	public static void main(String args[])
	{
		Test t =new Test();
		t.show();
		t.display();
		t.fun();
	}
}
