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
		g.drawRect(300,200,400,500);
		g.fillRect(300,200,400,500);
	}
}
class Demo
{
	public static void main(String args[])
	{
		WinDemo obj =new WinDemo();
	}
}
	
