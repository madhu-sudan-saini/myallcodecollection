
import java.util.Vector;	
class First
{
	public static void main(String args[])
	{
		Vector v =new Vector();
		System.out.println("size of vector list :"+v.size());
		System.out.println("capacity of vector list :"+v.capacity());
		System.out.println("vector list is isEmpty  :"+v.isEmpty());
		
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);
		
		System.out.println("size of vector list :"+v.size());
		System.out.println("capacity of vector list :"+v.capacity());
		System.out.println("vector list is isEmpty  :"+v.isEmpty());
	
	}
}		
