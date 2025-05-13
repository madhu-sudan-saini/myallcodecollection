import java.util.Vector;	
class First
{
	public static void main(String args[])
	{
		Vector<Integer> v =new Vector<Integer>();
		
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);
		

		for(int i : v)
		{
			System.out.println(i);
		}
	
	}
}		
