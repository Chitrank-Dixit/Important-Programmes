/* 110 WAP to change background color according to selected color from combo box. */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MyApplet8 extends Applet
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
					lb1.setBackground(Color.red);
				
				}
			else if(choice.getSelectedItem()=="BLACK")
				{
					lb1.setBackground(Color.black);
				
				}
			else
				{
					lb1.setBackground(Color.yellow);
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