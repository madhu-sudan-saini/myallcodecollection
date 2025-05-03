import javax.swing.*;
class Demo
{
	public static void main(String args[])
	{
		int i, a,b,start,end;
		a=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		b=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		if(a>b)
		{
			start=b;
		}
		else
		{
			start=a;
		}
		end=1;
		for(i=start;i>=end;i--)
		{
			if(a%i==0  && b%i==0)
			{
				System.out.println("lcm is :"+i);
				break;
			}
		}
		
	}
}
