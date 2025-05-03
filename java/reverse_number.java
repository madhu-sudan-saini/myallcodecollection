import javax.swing.*;
class Demo
{
	public static void main(String args[])
	{
		int num,sum=0,digit,rev=0;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		while(num>0)
		{
			digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		System.out.println("sum of digit:"+rev);
	}
}
