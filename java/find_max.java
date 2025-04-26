import javax.swing.*;

class max {
    public static void main(String args[]) {
        int i, num,max=0;
        i = 1;
      
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));

            if(i==1)
            {
                max=num;       
            }
            else if(num>max)
            {
                max=num;
            }
            i++;
        }
	while (i <= 10);
        System.out.println("max number is: " + max);

    }
}
