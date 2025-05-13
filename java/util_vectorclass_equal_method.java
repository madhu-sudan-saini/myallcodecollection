import java.util.Vector;	
class First
{
	public static void main(String args[])
	{
		Vector<Integer> v1 =new Vector<Integer>();
		
		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);
		v1.addElement(40);
		v1.addElement(50);
		v1.addElement(60);

		Vector<Integer> v2 =new Vector<Integer>();
		
		v2.addElement(10);
		v2.addElement(20);
		v2.addElement(30);
		v2.addElement(40);
		v2.addElement(50);
		v2.addElement(60);

		boolean ans=v1.equals(v2);
		
		System.out.println(ans);
	
	}
}		
