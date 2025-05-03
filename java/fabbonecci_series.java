import javax.swing.*;
class Demo
{
	public static void main(String args[])
	{
		int i, a,b,c,start,end;
		a=0;
		b=1;
		System.out.print(a);
		System.out.print(" "+b);

		do
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		while(c<=20);	
	}
}
