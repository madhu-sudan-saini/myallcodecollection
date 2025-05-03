
import javax.swing.*;
class Demo
{
	public static void main(String args[])
	{
		int num,sum=0,digit;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		int k=num;
		while(num>0)
		{
			digit=num%10;
			int cube=digit*digit*digit;
			sum=sum+cube;
			num=num/10;
		}
		if(sum==k)
		{
		System.out.println("armstrong :");
		}
		else
		{
		System.out.println("not armstrong");
		}
	}
}
