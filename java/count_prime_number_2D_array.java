import javax.swing.*;
class First {
    public static void main(String args[]) {
        int arr[][] = new int[3][3];
	int i,j,k,count=0,flag=1;
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			arr[i][j]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		}
	}
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			flag=1;
			for(k=2;k<arr[i][j];k++)
			{
				if(arr[i][j]%k==0)
				{
				flag=0;
				break;
				}
			}
			if(flag==1)
			{
				count++;
			}
		
		}
	}
	System.out.println("count all prime number is :"+count);		
    }
}
