import javax.swing.*;
class First {
    public static void main(String args[]) {
        int arr[][] = new int[3][3];
	int i,j,sum=0;
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			arr[i][j]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		}
	}
	for(i=0;i<=2;i++)
	{
		sum=0;
		for(j=0;j<=2;j++)
		{
			sum=sum+arr[j][i]+arr[i][j];
			System.out.print("\t"+arr[i][j]);
			
		}
		System.out.println("="+sum);
	}		
    }
}
