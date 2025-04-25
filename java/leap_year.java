import javax.swing.*;

class even {
    public static void main(String args[]) {
        int year;
        year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year"));
        
        if (year % 2 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
