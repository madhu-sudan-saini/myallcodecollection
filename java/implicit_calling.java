class A {
   public  A() {
        System.out.println("Constructor of class A called");
    }
}

class B extends A {
   public  B() {
        System.out.println("Constructor of class B called");
    }
}

class Demo {
    public static void main(String[] args) {
        B obj = new B();  
    }
}
