class Arithmatic
{
	public void add(int a,double b)
	{
		double ans1=a+b;
		System.out.println("addition is :"+ans1);
	}
	public void add(double a,double b)
	{
		double ans2=a+b;
		System.out.println("addition is :"+ans2);
	}
	
}

class Demo
{
	public static void main(String args[])
	{
		Arithmatic obj=new Arithmatic();
		obj.add(10.5,20);
		obj.add(10.5,20.5);
	}
}
