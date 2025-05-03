import javax.swing.*;
class Demo
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=1;i<6;i++)
		{
			k=6-i;
			for(j=1;j<=6-i;j++)
			{	

				System.out.print(k);
				k--;
			}
			
			System.out.print("\n");
		}
	}
}
