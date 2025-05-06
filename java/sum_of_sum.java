import javax.swing.*;
class First
{
	public static int addition(int num)
	{
		int digit,sum=0;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
			if(sum> 9  && num==0)	
			{
				num=sum;
				sum=0;
			}
		}
			
	
		return sum;
					
	}
	public static void main(String args[])
	{
		int sum,num;
		num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
		sum=addition(num);
		System.out.println("addition is :"+sum);

	
	}
}
		
