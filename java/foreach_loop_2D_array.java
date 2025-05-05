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
	for(int k[] : arr)
	{
		for(int p : k)
		{
		System.out.print("\t"+p);
		}
		System.out.println();
	}
   		
   }
}
