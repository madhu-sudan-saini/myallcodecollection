class First
{
	public static void main(String args[])
	{
		StringBuffer obj=new StringBuffer("madhu sudan saini");
		int len=obj.length();
		
		System.out.println("String is :"+obj);
		System.out.println("String length :"+len);
		
		obj.setLength(5);
		len=obj.length();
		
		System.out.println("String is :"+obj);
		System.out.println("String length :"+len);
	}
}
	
