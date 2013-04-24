/* 69 In the above application fill different colors in the circle & rectangle.  */
import java.applet.*;
import java.awt.*;
public class MyApplet4 extends Applet
{
	String s,s1;
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.green);
		setSize(1000,800);
		setLayout(new GridLayout(3,1));
		s="India";
		System.out.println("India");
	}
	public void start()
	{
		s1="Now getting better and better";
		System.out.println("Now getting better and better");
	}
	public void paint(Graphics g)
	{
		
		g.fillRect(50,50,170,150);
		g.setColor(Color.blue);
		g.fillOval(51,51,50,60);
		
		
		
		System.out.println("This is a paint method");
	}
	public void stop()
	{
		System.out.println("This is stop method");
	
	}
}