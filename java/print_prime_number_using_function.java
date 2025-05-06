import javax.swing.*;
class First
{
	public static void addition(int num)
	{
		int flag=1,i;
		for(i=2;i<num;i++)
		if(num%i==0)
		{
			flag=0;
			break;
		}
		if(flag==1)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime");
		}			
	}
	public static void main(String args[])
	{
		int num;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		
		addition(num);
	
	}
}
		
