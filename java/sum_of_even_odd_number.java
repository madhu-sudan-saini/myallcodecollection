import javax.swing.*;

class avg {
    public static void main(String args[]) {
        int i, num, count1 = 0, count2 = 0,sum1=0,sum2=0;
        i = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));

        while (i <= num) {
            if (i % 2 == 0) {
                sum1=sum1+i;
                count1++;
            } else {
                sum2=sum2+i;
                count2++;
            }
            i++; 
        }

        System.out.println("sum of even number is : " + sum1);
        System.out.println("sum of odd number is : " + sum2);
    }
}
