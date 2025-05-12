import java.util.*;
class Systemdata
{
	public static void main(String args[])
	{
		Date d=new Date();
		d.setDate(15);
		d.setMonth(10);
		d.setYear(2030);
		int date=d.getDate();
		int month=d.getMonth();
		int year=d.getYear();
		
		System.out.println(" System set date");
		System.out.println(date+"/"+month+"/"+year);
	}
}
		
