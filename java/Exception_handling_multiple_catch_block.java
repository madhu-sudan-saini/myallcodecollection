import javax.swing.*;
class First 
{
	public static void main(String args[])
	{
		int a,b,ans=0;
		try
		{
		a=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));

		 ans=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("error :"+e);
		}	

		catch(NumberFormatException ee) 
		{
			System.out.println("error :"+ee);
		}
		
		System.out.println("ans :"+ans);
		System.out.println("end of main");
	}
}
