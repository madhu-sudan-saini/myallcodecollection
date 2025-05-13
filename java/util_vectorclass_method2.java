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

		System.out.println(v1);
		
		v1.insertElementAt(25,2);
			
		System.out.println(v1);
		
		int ans=v1.remove(3);
		
		System.out.println(v1);
		
		v1.removeAllElements();
		
		System.out.println(v1);
		
	
	}
}		
