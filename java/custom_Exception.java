import javax.swing.*;
class MyException extends Exception
{
	private String message;
	public MyException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
}
class Demo 
{
	public static void main(String args[])
	{
		int marks;
		try
		{
			marks=Integer.parseInt(JOptionPane.showInputDialog("enter marks"));
		
			if(marks < 0 || marks > 100)
			{
			throw new MyException("Invalid marks");
			}
			else
			{
			System.out.println("marks is :"+marks);
			}
		}
		catch(MyException e)
		{
			System.out.println("error :"+e.getMessage());
			System.out.println("end of main");
		}

	}
}
