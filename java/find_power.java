import javax.swing.*;

class Power {
    public static void main(String args[]) {
        int i,num,base,expo,ans=1;
        i = 1;
	base = Integer.parseInt(JOptionPane.showInputDialog("enter base "));
	expo = Integer.parseInt(JOptionPane.showInputDialog("enter expo"));

	for(i=1;i<=expo;i++)
	{
		ans=base*ans;
	}
	 System.out.println("power of is :"+ans);
    }
}
