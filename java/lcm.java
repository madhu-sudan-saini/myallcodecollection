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
			start=a;
		}
		else
		{
			start=b;
		}
		end=a*b;
		for(i=start;i<=end;i++)
		{
			if(i%a==0  && i%b==0)
			{
				System.out.println("lcm is :"+i);
				break;
			}
		}
		
	}
}
