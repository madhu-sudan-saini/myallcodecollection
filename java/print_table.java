import javax.swing.*;

class Table {
    public static void main(String args[]) {
        int i,k,ans;
        i = 1;
	k = Integer.parseInt(JOptionPane.showInputDialog("enter number to print table"));
	for(i=1;i<=10;i++)
	{
		ans=i*k;
		
      System.out.println(i+"*"+k+"="+ans);
	  }

  }
}
