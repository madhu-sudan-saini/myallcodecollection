import javax.swing.*;

class even {
    public static void main(String args[]) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        
        if (num % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("Odd number");
        }
    }
}
