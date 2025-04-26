import javax.swing.*;
class Demo
{
 public static void main(String args[])
  {
   int choice;

     System.out.println("enter 1 to arithmatic operation");
     System.out.println("enter 2 to geomatric operation");
     choice=Integer.parseInt(JOptionPane.showInputDialog("enter your choice"));
     switch(choice)
	{
         case 1:
              System.out.println("****welcome to arithmatic operation****");
             System.out.println("enter 1 to addition");
             System.out.println("enter 2 to subtraction");
	     System.out.println("enter 3 to multipal");
	     System.out.println("enter 4 to divison");
 	     System.out.println("enter 5 to modulas");
             choice=Integer.parseInt(JOptionPane.showInputDialog("enter your choice"));
             switch(choice)
		{
	      case 1:
                 System.out.println("****welcome to addition block****");
                 int a,b,c;
                 a=Integer.parseInt(JOptionPane.showInputDialog("enter first number"));
		 System.out.println(" first number is :"+a);
	         b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
		 System.out.println(" second number is :"+b);
		 c=a+b;
		 System.out.println("sum is "+c);
                 break;
	      case 2:
                  
                 System.out.println("****welcome to subtraction block****");
                 a=Integer.parseInt(JOptionPane.showInputDialog("enter first number"));
		 System.out.println(" first number is :"+a);
	         b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
		 System.out.println(" second number is :"+b);
		 c=a-b;
		 System.out.println("subtraction is "+c);
                 break;
	     case 3:
                  
                 System.out.println("****welcome to multipal block****");
                 a=Integer.parseInt(JOptionPane.showInputDialog("enter first number"));
 		 System.out.println(" first number is :"+a);
	         b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
		 System.out.println(" second number is :"+b);
		 c=a*b;
		 System.out.println("multipal is "+c);
                 break;
	     case 4:
                 System.out.println("****welcome to divison block****");
                 a=Integer.parseInt(JOptionPane.showInputDialog("enter first number"));
		 System.out.println("first number is :"+a);
	         b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
		 System.out.println("second number is :"+b);
		 c=a/b;
		 System.out.println("divison is "+c);
                 break;
             case 5:
                 System.out.println("****welcome to modulas block****");
                 a=Integer.parseInt(JOptionPane.showInputDialog("enter first number"));
		 System.out.println(" first number is :"+a);
	         b=Integer.parseInt(JOptionPane.showInputDialog("enter second number"));
		 System.out.println(" second number is :"+b);
		 c=a%b;
		 System.out.println("madulas is "+c);
                 break;
              	 default:
                 System.out.println("invalid number");
                 }
                 break;
        case 2: 
             System.out.println("****welcome to geomatric operation****");
             System.out.println("enter 1 to area of cricle");
             System.out.println("enter 2 to area of triangle");
	     System.out.println("enter 3 to area of rectangle ");
	     System.out.println("enter 4 to area of square");
             choice=Integer.parseInt(JOptionPane.showInputDialog("enter your choice"));
             switch(choice)
                 {
	    case 1:
		System.out.println("****welcome to find the area of circle****");
		double area;
		int r;
 		r=Integer.parseInt(JOptionPane.showInputDialog("enter radius"));
		System.out.println(" radius is :"+r);
		area= 3.14*r*r;
                System.out.println("area of cricle is "+area);
		break;
	    case 2:
                System.out.println("****welcome to find the area of triangle****");
		int b,h;
 		b=Integer.parseInt(JOptionPane.showInputDialog("enter base of triangle"));
		System.out.println(" base is :"+b);
                h=Integer.parseInt(JOptionPane.showInputDialog("enter hight of triangle"));
		System.out.println(" hight is :"+h);
		area= 0.5*b*h;
                System.out.println("area of triangle is "+area); 
		break;
	    case 3:
		System.out.println("****welcome to find the area of rectangle****");
		int l;
		b=Integer.parseInt(JOptionPane.showInputDialog("enter breadth of rectangle"));
		System.out.println(" breadth is :"+b);
 		l=Integer.parseInt(JOptionPane.showInputDialog("enter length of rectangle"));
		System.out.println(" length is :"+l);
		area= l*b;
                System.out.println("area of rectangle is "+area);
		break;
            case 4:
		System.out.println("****welcome to find the area of circle***");
		l=Integer.parseInt(JOptionPane.showInputDialog("enter length"));
		System.out.println(" length is :"+l);
		area= l*l;
                System.out.println("area of square is "+area);
		break;
		default:
		System.out.println(" invalid number");
                 }
		break;
	    default:
		System.out.println(" invalid number");
         }
      }
}                    
          
