import java.util.*;	
class First
{
	public static void main(String args[])
	{
		Hashtable h =new Hashtable();
		
		System.out.println("size of hashtable is :"+h.size());
		System.out.println("empty or not :"+h.isEmpty());
		
		h.put(101 ,"kamal");
		h.put(102, 103);
		h.put(104 , 50.5);
		h.put("delhi" ,"India");
		h.put('m' ,"madhu sudan");
		
		System.out.println("size of hashtable is :"+h.size());
		System.out.println("empty or not : "+h.isEmpty());

		System.out.println(h);
	
	}
}		
