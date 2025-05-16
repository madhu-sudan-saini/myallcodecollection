class thread
{
	public static void main(String args[])
	{
		Thread.currentThread().setName("parent");
		String name=Thread.currentThread().getName();
		System.out.println("name of current Thread   :"+name);
	}
}
