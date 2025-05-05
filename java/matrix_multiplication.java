import javax.swing.*;
class First {
    public static void main(String args[]) {
        int arr1[][] = new int[3][3];
	int arr2[][] = new int[3][3];
	int arr3[][] = new int[3][3];
	int i,j,k,sum=0;
	System.out.println("enter first matrix:");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			arr1[i][j]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		}
	}
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			System.out.print("\t"+arr1[i][j]);
		}
		System.out.println();
	}
	System.out.println("enter second matrix:");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			arr2[i][j]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		}
	}
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			System.out.print("\t"+arr2[i][j]);
		}
		System.out.println();
	}
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			arr3[i][j]=0;
			for(k=0;k<=2;k++)
			{
				arr3[i][j]=(arr3[i][j]+(arr1[i][k]*arr2[k][j]));
			}
		}
	}
	
	System.out.println("matrix multiplication:");
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			System.out.print("\t"+arr3[i][j]);
		}
		System.out.println();
	}
    		
   }
}
