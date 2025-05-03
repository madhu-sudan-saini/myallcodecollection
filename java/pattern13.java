import javax.swing.*;
class Demo
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			k=65;
			for(j=1;j<=6-i;j++)
			{	
				System.out.print((char)k);
				k++;
			}
			System.out.print("\n");
		}
	}
}
