class A {

   private int x;
   public  A(int x)
    {
	this.x=x;
        System.out.println("base class Constructor is called");
	 System.out.println("value of x is :"+x);

    }
}

class B extends A {
   private int y;
   public  B(int x,int y)
    {
	super(x);
	this.y=y;
        System.out.println("derived class Constructor is called");
	System.out.println("value of y is :"+y);
    }
}

class Demo {
    public static void main(String[] args)
    {
        B obj = new B(10,20);  
    }
}
