/* 77  WAP in java to exit from a Frame window when we click on Close button. */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

 class MyFrame extends JFrame  // implements ActionListener
{
	JButton btn1;
	
	

	public MyFrame(String s)	
	{	super(s);
		setLayout(new FlowLayout());
		setVisible(true);
	 	// setSize(400,400);			
	 	btn1=new JButton("close");
	    
		add(btn1);
		
		pack();

		btn1.addActionListener(new ActionListener(){ 

		public void actionPerformed(ActionEvent ae)
		{					
		  try{
		        dispose();  	
		   }
		   catch(Exception e) {}	
		}});
		}
		public static void main(String args[])
		{
			MyFrame ob=new MyFrame("New Frame");
		
		}
}