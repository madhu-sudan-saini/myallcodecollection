import javax.swing.*;
class First {
    public static void main(String args[]) {
        int arr[] = new int[10];
	int i,j,sum=0;
	for(i=0;i<10;i++)
	{
		arr[i]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
	}
	for(int k : arr)
	{
		System.out.println(k);
	}
   		
   }
}
