import javax.swing.*;
class First {
    public static void main(String args[]) {
        int arr[][] = new int[3][];
	int i,j;
	arr[0]= new int[3];
	arr[1]= new int[4];
	arr[2]= new int[5];
	System.out.println(" first matrix:");
	for(i=0;i<arr.length;i++)
	{
		for(j=0;j<arr[i].length;j++)
		{
			arr[i][j]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		}
	}
	for(i=0;i<arr.length;i++)
	{
		for(j=0;j<arr[i].length;j++)
		{
			System.out.print("\t"+arr[i][j]);
		}
		System.out.println();
	}
	    		
   }
}
