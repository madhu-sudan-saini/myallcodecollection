class thread
{
	public static void main(String args[])
	{
		
		int pno=Thread.currentThread().getPriority();
		System.out.println("priority of current Thread   :"+pno);
	}
}
