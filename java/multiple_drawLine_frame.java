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
		g.drawLine(200,200,200,700);
		g.drawLine(200,200,500,450);
		g.drawLine(800,200,500,450);
		g.drawLine(800,200,800,700);

	}
}
class Demo
{
	public static void main(String args[])
	{
		Windemo obj =new Windemo();
	}
}
	
