import javax.swing.*;

class First
{
	public static void main(String args[])
	{
		
		StringBuffer s1=new StringBuffer("hello");
		StringBuffer s2=new StringBuffer("world");

		s1.append(" ");
		s1.append(s2);
		

		System.out.println(s1);
	}
}
	
