import java.util.Stack;
class stack
{
	public static void main(String args[])
	{
		Stack<Integer> s= new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);

		System.out.println(s);
	
		System.out.println("top element :"+s.peek());
	

		s.pop();

		System.out.println(s);
		
		s.pop();

		System.out.println(s);
		
		System.out.println("top element :"+s.peek());

	}
}
	
		
