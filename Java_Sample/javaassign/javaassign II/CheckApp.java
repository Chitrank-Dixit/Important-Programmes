/* 120 WAP in java to demonstrate Check Boxes in applet. */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class CheckApp extends Applet
{
	
	Checkbox cb;
	Label lb1;
	public void init()
	{
		
		setSize(250,250);
		setLayout(new GridLayout(3,1));
		cb=new Checkbox("Check It");
		lb1=new Label("Can't Say");
		add(this.cb);
		add(this.lb1);
		cb.addItemListener(new ItemListener(){
		public void itemStateChanged(ItemEvent ae)
		{
			boolean b=cb.getState();
			if(b)
				lb1.setText("Checked");
				add(lb1);
		}
		});
	}
		
	
	
}