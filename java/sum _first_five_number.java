import javax.swing.*;

class sum {
    public static void main(String args[]) {
        int i, num, sum=0;
        i = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));

        while (i <= num) {
            if(i<=5)
            {
                sum=sum+i;       
            }
            i++;
        }
        System.out.println("sum of even number is : " + sum);
   
    }
}
