import javax.swing.*;
class First
{
	public static void main(String args[])
	{
	int i,j,value,loc;
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
	value=Integer.parseInt(JOptionPane.showInputDialog("enter value to insert"));
	loc=Integer.parseInt(JOptionPane.showInputDialog("enter location where value insert"));
	loc--;
	for(i=4;i>=loc;i--)
	{
		arr[i+1]=arr[i];
	}
	arr[loc]=value;
  
	System.out.println("after insert:");
	for(i=0;i<6;i++)
	{
		System.out.println(arr[i]);
	}
		
	}
}
