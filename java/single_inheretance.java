class Parent {
    public void show() {
        System.out.println("show parent");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("show child");  
    }
}

class Demo {
    public static void main(String args[]) {
        Child c = new Child();
        c.show();    
        c.display(); 
    }
}
