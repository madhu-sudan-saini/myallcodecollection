import javax.swing.*;
class read_char
  {
    public static void main(String args[])
    {
      String s;
      s=JOptionPane.showInputDialog("enter a character");
       char ch =s.charAt(0);

        System.out.println("char value is"+ch);
      }
}
