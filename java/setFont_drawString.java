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
		Font f=new Font("Arial",Font.BOLD+Font.ITALIC,30);
		g.setFont(f);
		g.setColor(Color.YELLOW);
		g.drawString("Hello World!",400,400);
		

	}
}
class Demo
{
	public static void main(String args[])
	{
		WinDemo obj =new WinDemo();
	}
}
	
