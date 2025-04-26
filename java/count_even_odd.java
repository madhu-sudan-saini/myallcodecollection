import javax.swing.*;

class avg {
    public static void main(String args[]) {
        int i, num, count1 = 0, count2 = 0;
        i = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));

        while (i <= num) {
            if (i % 2 == 0) {
                count1++;
            } else {
                count2++;
            }
            i++; 
        }

        System.out.println("even is : " + count1);
        System.out.println("odd is : " + count2);
    }
}
