import javax.swing.*;
class Demo
{
	public static void main(String args[])
	{
		int i,j,sp;
		for(i=1;i<=5;i++)
		{
			for(sp=1;sp<=i;sp++)
			{	
				System.out.print(" ");
			}
				for(j=1;j<=6-i;j++)
				{	
					System.out.print(" *");
				}
			System.out.print("\n");
		}
	}
}
