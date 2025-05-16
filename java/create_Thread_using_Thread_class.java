class Mythread extends Thread
{

	public Mythread(String name)
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
		Mythread m =new Mythread("child");
	
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
		
			
	
