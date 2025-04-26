import javax.swing.*;
class Demo
 {
  public static void main (String args[])
  {
	System.out.println("enter 1 to hello");
	System.out.println("enter 2 to bye");
	System.out.println("enter 3 to more option");
    int choice;
    choice=Integer.parseInt(JOptionPane.showInputDialog("enter your choice"));
     switch(choice)
     {
	case 1:
 		System.out.println("Hello world");
 		break;
	case 2:
 		System.out.println("bye world");
 		break;
	case 3:
   		System.out.println("enter 1 to GM");
		System.out.println("enter 2 to GN");
    		choice=Integer.parseInt(JOptionPane.showInputDialog("enter your choice"));
                switch(choice)
		{
 		System.out.println("tuesday");
 		break;
	  case 1 :
		  System.out.println("GOOD MORNING WORLD");
   		  break;
	   case 2:
		  System.out.println("GOOD NIGHT WORLD");
   		  break;
           default:
		System.out.println("invaild number");
   		
                }
              break;
	default:
		System.out.println("invaild number");
   		
     }
  }
}
