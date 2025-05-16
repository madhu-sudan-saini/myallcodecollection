class MyThread extends Thread
{

	public MyThread(String name)
	{
		super(name);
		start();
	}	
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{	

		try
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
		
		}
		}
	}
}
class Demo
{
	public static void main(String args[])
	{
		MyThread m1 =new MyThread("child1");
		MyThread m2 =new MyThread("child2");
		MyThread m3 =new MyThread("child3");
	
		int i;
		for(i=0;i<=10;i++)
		{	

		try
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
		
		}
		}
	}
}
		
			
	
