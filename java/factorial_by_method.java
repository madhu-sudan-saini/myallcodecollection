import javax.swing.*;
class First
{
public static void factorial()
{
	int num,fact=1;
	num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial is:"+fact);
}
public static void main(String args[])	
{
	factorial();
}
}
	
	
