class First 
{
	public static void main(String args[])
	{
		int a,b,ans=0;
		a=10;
		b=0;
		try
		{
		 ans=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("error :"+e);
		}
		
		System.out.println("ans :"+ans);
		System.out.println("end of main");
	}
}
