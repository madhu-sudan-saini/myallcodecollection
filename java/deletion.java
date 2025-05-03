import javax.swing.*;
class First
{
	public static void main(String args[])
	{
	int i,j,loc=-1,value;
	int arr[]=new int[6];
	for(i=0;i<5;i++)	
	{
	arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
	}
	System.out.println("befor sorting:");
	for(i=0;i<5;i++)
	{
		System.out.println(arr[i]);
	}
	value=Integer.parseInt(JOptionPane.showInputDialog("enter location where value delete"));
	for(i=0;i<5;i++)
	{
		if(arr[i]==value)
		{
			loc=i;
			break;
		}
		
	}
	if(loc==-1)
	{
        	System.out.println("no data found");
	}
	else
	{
	for(i=loc;i<4;i++)
	{
		arr[i]=arr[i+1];
	}
	}
	System.out.println("after delete:");
	for(i=0;i<4;i++)
	{
		System.out.println(arr[i]);
	}	
		
	}
}
