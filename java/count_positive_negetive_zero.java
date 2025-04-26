import javax.swing.*;

class sum {
    public static void main(String args[]) {
        int i, num,pos=0,neg=0,zero=0;
        i = 1;
      
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("enter a number"));

            if(num>0)
            {
                pos++;       
            }
            else if(num<0)
            {
                neg++;
            }
            else if(num==0)
            {
                zero++;
            }
            i++;
        }
	while (i <= 10);
        System.out.println("count all positive  number is : " + pos);
        System.out.println("count all  negetive number is : " + neg);
        System.out.println("count all zero number is : " + zero);
    }
}
