/* 70 Write an application that displays any string. Choose color from combo box to change the color of this displayed string. */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MyApplet5 extends Applet
{
	String s,s1;
	Choice choice;
	Label lb1;
	public void init()
	{
		
		setSize(1000,800);
		setLayout(new GridLayout(3,1));
		s="India";
		System.out.println("India");
		lb1=new Label("Chitrank");
		choice=new Choice();
		this.add(lb1);
		this.add(choice);
		
		choice.add("RED");
		choice.add("BLACK");
		choice.add("YELLOW");
		choice.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent ae)
		{
			if(choice.getSelectedItem()=="RED")
				{
					lb1.setForeground(Color.red);
				
				}
			else if(choice.getSelectedItem()=="BLACK")
				{
					lb1.setForeground(Color.black);
				
				}
			else
				{
					lb1.setForeground(Color.yellow);
				}
		}
		});
		}
		
	
	public void start()
	{
		
	}
	public void paint(Graphics g)
	{
		
		
		
				
		
		
	}
	public void stop()
	{
		System.out.println("This is stop method");
	
	}
}