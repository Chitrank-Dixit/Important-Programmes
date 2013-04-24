/* 72 WAP to demonstrat BorderLayout in AWT window.  */
import java.awt.*;
import java.applet.*;
public class MyApplet7 extends Applet
{
	Button btnEast,btnCenter,btnWest,btnNorth,btnSouth;
	public void init()
	{
		
		setSize(250,250);
		setVisible(true);
		setLayout(new BorderLayout());
		btnEast=new Button("East");
		btnWest=new Button("West");
		btnNorth=new Button("North");
		btnSouth=new Button("South");
		btnCenter=new Button("Center");
	
		add(this.btnEast,"East");
		add(this.btnWest,"West");
		add(this.btnNorth,"North");
		add(this.btnSouth,"South");
		add(this.btnCenter,"Center");
	
	}
	
	
	
	



}