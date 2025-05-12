import java.util.*;
class Systemtime
{
	public static void main(String args[])
	{
		Date d=new Date();

		int hours=d.getHours();
		int minutes=d.getMinutes();
		int seconds=d.getSeconds();
		
		System.out.println(" System set time");
		System.out.println(hours+"-"+minutes+"-"+seconds);
	}
}
		
