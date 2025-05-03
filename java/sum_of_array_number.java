import javax.swing.*;
class First
{
	public static void main(String args[])
	{
	int i,sum=0;
	int arr[]=new int[5];
	for(i=0;i<5;i++)	
	{
	arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
	}
	for(i=0;i<arr.length;i++)	
	{
		sum=sum+arr[i];
	}
	System.out.println("sum is :"+sum);
			
	}
}
