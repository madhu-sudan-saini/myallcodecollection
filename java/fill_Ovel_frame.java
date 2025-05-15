import java.awt.*;
class Windemo extends Frame
{
	public Windemo()
	{
		
		setSize(1000,1000);
		setTitle("eg of frame");
		setBackground(Color.RED);
		setVisible(true);
	}
	public void paint(Graphics g)
	{

		g.setColor(Color.YELLOW);
		g.fillOval(300,200,400,400);
		
	}
}
class Demo
{
	public static void main(String args[])
	{
		Windemo obj =new Windemo();
	}
}
	
