
import javax.swing.*;
public class marks
{
		private String name;
		private int rollno;
		private int pmarks;
		private int cmarks;
		private int mmarks;
		private int tmarks;
		private float percentage;
		
		public void getdata()
		{
			name=JOptionPane.showInputDialog("enter your name");
			rollno=Integer.parseInt(JOptionPane.showInputDialog("enter your roll number"));
			pmarks=Integer.parseInt(JOptionPane.showInputDialog("enter your physics marks"));
			cmarks=Integer.parseInt(JOptionPane.showInputDialog("enter your chemistry marks"));
			mmarks=Integer.parseInt(JOptionPane.showInputDialog("enter your math marks"));
		}
		public void calculateresult()
		{
			tmarks=pmarks+cmarks+mmarks;
			percentage=tmarks/3;
		}
		public void showdata()
		{
		
			System.out.println("name:"+name);
			System.out.println("roll number:"+rollno);
			System.out.println("physics marks:"+pmarks);
			System.out.println("chemistry marks:"+cmarks);
			System.out.println("math marks:"+mmarks);
			System.out.println("total marks: "+tmarks+" out of 300");
			System.out.println("percentage:"+percentage);
		}
}
class Demo
{
	public static void main(String args[])
	{
		marks m = new marks();
		m.getdata();
		m.calculateresult();
		m.showdata();
	}
}

		
