import javax.swing.*;
class First
{
	public static void main(String args[])
	{
	int i,j,temp;
	int arr[]=new int[5];
	for(i=0;i<5;i++)	
	{
	arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
	}
	System.out.println("befor sorting:");
	for(i=0;i<5;i++)
	{
		System.out.println(arr[i]);
	}
	for(i=0;i<5;i++)	
	{
		for(j=i+1;j<5;j++)
		{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
	}
	System.out.println("after sorting:");
	for(i=0;i<=5;i++)
	{
		System.out.println(arr[i]);
	}
		
	}
}
