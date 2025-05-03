import javax.swing.*;
class First
{
	public static void main(String args[])
	{
	int i;
	int arr[]=new int[5];
	for(i=0;i<5;i++)	
	{
	arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
	}
	for(i=0;i<arr.length;i++)	
	{
		System.out.println(arr[i]);
	}
	
			
	}
}
