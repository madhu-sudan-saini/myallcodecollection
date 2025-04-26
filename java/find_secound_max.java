import javax.swing.*;

class second_max {
    public static void main(String args[]) {
        int i, num,max1=0,max2=0;
        i = 1;
      
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));

            if(i==1)
            {
                max1=num;       
            }
            else if(num>max1)
            {
                max2=max1;
		max1=num;
            }
	     else if(num>max2)
	    {
                max2=num;
	    }
            i++;
        }
	while (i <= 10);
        System.out.println(" second max number is: " + max2);

    }
}
