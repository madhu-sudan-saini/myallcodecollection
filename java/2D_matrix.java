import javax.swing.*;
class First {
    public static void main(String args[]) {
        int arr[][] = new int[3][3];
	int i,j;
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
			System.out.print("\t"+arr[i][j]);
		}
		System.out.println();
	}		
    }
}
