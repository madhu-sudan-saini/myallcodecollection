import javax.swing.*;
class avg
{
public static void main(String args[])
{
int i,num,sum=0;
double avg=0;
i=1;
num=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
while(i<=num)
{
sum=sum+i;
i++;
}
avg=sum/num;
System.out.println("sum is "+sum);
System.out.println("averge is "+avg);
}
}
