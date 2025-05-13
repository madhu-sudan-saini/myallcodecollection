import java.util.*;	
class First
{
	public static void main(String args[])
	{
		Hashtable<Integer,String> h =new Hashtable<Integer,String>();
		
		h.put(101 ,"jaipur");
		h.put(102, "alwar");
		h.put(103 , "sikar");
		h.put(104 ,"bharatput");
		h.put(105 , "Dausa");
	
		System.out.println(h);
		
		Enumeration k=h.keys();
		while(k.hasMoreElements())
		{
			System.out.println(k.nextElement());
		}

		Enumeration e=h.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
	
	}
}		
