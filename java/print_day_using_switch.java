import javax.swing.*;
class day
  {
    public static void main(String args[])
    {
      int num;
      num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
      switch(num)
      {
	case 1:
        	System.out.println("monday");
		break;
	case 2:
        	System.out.println("tuesday");
		break;
	case 3:
        	System.out.println("wednesday");
		break;
	case 4:
        	System.out.println("thrusday");
		break;
	case 5:
        	System.out.println("friday");
		break;
	case 6:
        	System.out.println("sturday");
		break;
	case 7:
        	System.out.println("sunday");
		break;
       default:
        	System.out.println("Invalid number");
		break;
      }
     }
  } 
