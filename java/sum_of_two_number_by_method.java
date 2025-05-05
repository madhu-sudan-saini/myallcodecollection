import javax.swing.*;
class First
{
	public static void addition(int a,int b)
	{
		int ans;
		ans=a+b;
		System.out.println("sum is :"+ans);
	}
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		
		addition(a,b);
	
	}
}
		
