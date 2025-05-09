interface First
{
	void show();
}
class Test implements  First
{
	public void show()
	{	
		System.out.println("show is called");
	}
}
class  Demo
{
	public static void main(String args[])
	{
		Test t =new Test();
		t.show();
	}
}
