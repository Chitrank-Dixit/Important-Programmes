// this is program no 67
/* Create an application to draw one line perpendicular to other. One line parallel to other. done  */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MyApplet2 extends Applet
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
	
	g.drawString("Perpendicular",12,150);
	g.drawLine(100,100,100,150);
	g.drawLine(150,150,100,150);
	g.drawString("Parallel",12,185);
	g.drawLine(100,200,250,200);
	g.drawLine(100,170,250,170);
	}
	public void destroy()
	{
	
	System.out.println("destroy method has started: ");
	
	}





}