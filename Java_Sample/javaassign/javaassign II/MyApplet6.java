/* 71 WAP to demonstrat AWT buttons with event handling. done Programmes on Applet */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MyApplet6 extends Applet
{
	Label lb1,lb2;
	Button bt1;
	TextField txt1,txt2,txt3,txt4;
	public void init()
	{
		lb1=new Label("Username");
		lb2=new Label("Password");
		bt1=new Button("show");
		
		txt1=new TextField(10);
		txt2=new TextField(10);
		txt3=new TextField(10);
		txt4=new TextField(10);
		this.add(lb1);
		this.add(txt1);
		this.add(lb2);
		this.add(txt2);
		this.add(bt1);
		this.add(txt3);
		this.add(txt4);
		bt1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
			txt3.setText(txt1.getText());
			txt4.setText(txt2.getText());
		
		
		}
				
		
		});
		
		
		
		
	
	
	
	
	}
	



}