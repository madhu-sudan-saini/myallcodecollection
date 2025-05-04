import javax.swing.*;
class First {
    public static void main(String args[]) {
        int arr[][] = new int[3][3];
	int i,j,pos=0,neg=0,zero=0;
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
			if(arr[i][j]>0)
			{
			System.out.println("positive :"+arr[i][j]);
			pos++;
			}

			else if(arr[i][j]<0)
			{
			System.out.println("negetive :"+arr[i][j]);
			neg++;
			}
			else if(arr[i][j]==0)
			{
			System.out.println("zero :"+arr[i][j]);
			zero++;
			}
		}
	}		
    }
}
