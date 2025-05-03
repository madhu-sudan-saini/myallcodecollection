import javax.swing.*;
class First
{
	public static void main(String args[])
	{
	int i,value,loc=-1;
	int arr[]=new int[5];
	for(i=0;i<5;i++)	
	{
	arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
	}
	value=Integer.parseInt(JOptionPane.showInputDialog("enter a value to search "));
	for(i=0;i<5;i++)	
	{
		if(arr[i]==value)
		{
			loc=i+1;
			break;
		}
	}
	if(loc==-1)
	{
		System.out.println("element not found");
	}
	else
	{
		System.out.println("element found at location:"+loc);
	}	
	}
}
