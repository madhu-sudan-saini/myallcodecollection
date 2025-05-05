import javax.swing.*;
class First
{
public static void sum()
{
	int num,ans=0;
	num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
	for(int i=1;i<=num;i++)
	{
		ans=ans+i;
	}
	System.out.println("sum is:"+ans);
}
public static void main(String args[])	
{
	sum();
}
}
	
	
