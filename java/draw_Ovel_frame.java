import java.awt.*;
class WinDemo extends Frame
{
	public WinDemo()
	{
		
		setSize(1000,1000);
		setTitle("eg of frame");
		setBackground(Color.RED);
		setVisible(true);
	}
	public void paint(Graphics g)
	{

		g.setColor(Color.YELLOW);
		g.drawOval(300,200,400,400);
		
	}
}
class Demo
{
	public static void main(String args[])
	{
		WinDemo obj =new WinDemo();
	}
}
	
