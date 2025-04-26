import javax.swing.*;

class Factorial {
    public static void main(String args[]) {
        int i,num,fact=1;
        i = 1;
	num = Integer.parseInt(JOptionPane.showInputDialog("enter number to print factorial"));
	for(i=1;i<=num;i++)
	{
		fact=i*fact;
	}
	 System.out.println("factorial is :"+fact);
    }
}
