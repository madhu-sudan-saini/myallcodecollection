class First
{
	public static void main(String args[])
	{
		//charAt() method
		String s="hello world";
		System.out.println(s);
		char ch =s.charAt(6);
		System.out.println("character of 6 index :"+ch);
		
		//indexOf() method
		System.out.println(s);
		int idx=s.indexOf('l');
		System.out.println("index of w is:"+idx);

		//lastIndex() method
		System.out.println(s);
		int idx1=s.lastIndexOf('l');
		System.out.println("index of l is:"+idx1);

		//equals() method
		String s1="hello";
		String s2="Hello";
		boolean ans=s1.equals(s2);
		System.out.println("equal or not :"+ans);

		//equalsIgnoreCase() method
		String s3="hello";
		String s4="Hello";
		boolean ans1=s3.equalsIgnoreCase(s4);
		System.out.println("equal or not :"+ans1);

		//compareTo() method
		String s5="hello";
		String s6="Hello";
		int ans2=s5.compareTo(s6);
		System.out.println("equal or not :"+ans2);
	
		//compareToIgnoreCase() method
		String s7="hello";
		String s8="Hello";
		int ans3=s7.compareToIgnoreCase(s8);
		System.out.println("equal or not :"+ans3);
		
		//toLowerCase() method
		String s9="HELLO";
		String ans4=s9.toLowerCase();
		System.out.println("lower Case  String is:"+ans4);
		
		//toUpperCase() method
		String s10="hello";
		String ans5=s10.toUpperCase();
		System.out.println("Upper Case  String is:"+ans5);

		//startsWith() method
		String st="abc@gmail.com";
		boolean ans6=st.startsWith("abc");
		System.out.println("it start with abc:"+ans6);
	
		//endsWith() method
		String st1="abc@gmail.com";
		boolean ans7=st1.endsWith("com");
		System.out.println("it ends+ with abc:"+ans7);



	}
}
		
		
