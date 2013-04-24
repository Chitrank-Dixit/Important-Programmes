/* 114 WAP in java to demonstrate GridLayout.  */
import java.awt.*;
import java.awt.event.*;
class GridLayoutDemo extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	public GridLayoutDemo(String s)
	{
		super(s);
		setSize(250,250);
		setVisible(true);
		setLayout(new GridLayout(2,3,4,5));
		b1=new Button("One");
		b2=new Button("Two");
		b3=new Button("Three");
		b4=new Button("Four");
		b5=new Button("Five");
		b6=new Button("Six");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
	
	
	}
	public static void main(String args[])
	{
		GridLayoutDemo gld=new GridLayoutDemo("Grid Layout");
	}


}