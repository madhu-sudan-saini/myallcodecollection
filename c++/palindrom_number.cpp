import javax.swing.*;
class Demo
{
	public static void main(String args[])
	{
		int num,sum=0,digit,rev=0;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		int k=num;
		while(num>0)
		{
			digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		if(rev==k)
		{
		System.out.println("palindrom:");
		}
		else
		{
		System.out.println("not palindrom");
		}
	}
}
