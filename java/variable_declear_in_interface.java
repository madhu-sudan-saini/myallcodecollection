interface First
{
	double pie=3.14;
}

interface Second
{
	double pie=2.14;
}

class Test implements  First
{
	public void show()
	{	
		System.out.println("value of pie:"+First.pie);
		System.out.println("value of pie:"+Second.pie);
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
