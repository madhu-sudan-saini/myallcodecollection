import java.util.*;
class Systemdata
{
	public static void main(String args[])
	{
		Date d=new Date();
		int date=d.getDate();
		int month=1+d.getMonth();
		int year=1900+d.getYear();
		
		System.out.println("current System date");
		System.out.println(date+"/"+month+"/"+year);
	}
}
		
