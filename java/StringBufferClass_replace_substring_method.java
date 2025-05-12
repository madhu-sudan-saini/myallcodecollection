
class First
{
	public static void main(String args[])
	{
		StringBuffer s3=new StringBuffer("hello world how are you ");
		
		System.out.println(s3);
	
		s3.replace(6,12,"ajmer ");
		
		System.out.println(s3);

		StringBuffer s4=new StringBuffer("hello world how are you ");
		
		System.out.println(s4);
	
		String ans=s4.substring(6,12);
		
		System.out.println(ans);
	}
}
	
