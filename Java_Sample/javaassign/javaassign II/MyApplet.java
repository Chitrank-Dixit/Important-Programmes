// this is program no 66
/* Create an application to draw a horizontal line. done */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MyApplet extends Applet
{
	public void init()
	{
	
	System.out.println("init method has started: ");
	
	}
	public void start()
	{
	
	System.out.println("start method has started: ");
	
	}
	public void paint(Graphics g)
	{
	
	System.out.println("paint method has started: ");
	g.drawLine(50,50,100,50);
	
	}
	public void destroy()
	{
	
	System.out.println("destroy method has started: ");
	
	}





}