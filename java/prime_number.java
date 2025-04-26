import javax.swing.*;

class Prime {
    public static void main(String args[]) {
        int i,num,flag=1;
	num = Integer.parseInt(JOptionPane.showInputDialog("enter number "));

	for(i=2;i<num;i++)
	{
		if(num%i==0)
		{
			flag=0;
			break;
		}
	}
		if(flag==1)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("number is not prime");
		}		
	 
     }
}
