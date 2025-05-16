class thread
{
	public static void main(String args[])
	{
		Thread.currentThread().setPriority(8);
		int pno=Thread.currentThread().getPriority();
		System.out.println("name of current Thread   :"+pno);
	}
}
