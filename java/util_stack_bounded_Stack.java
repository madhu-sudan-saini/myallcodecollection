import java.util.Stack;
class stack
{
	public static void main(String args[])
	{
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		for(int i : s)
		{
		System.out.println(i);
		}

	}
}
	
		
