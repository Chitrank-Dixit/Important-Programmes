/* 142 Write an application to create a GUI with two buttons such that clicking on the first displays 
the message “Welcome to SCS” on the window and clicking on the second changes the color of the message(hint : toggle the color) */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class ShowGUI extends JFrame
{
	JButton btn1,btn2;
	JLabel lb;
	

	public ShowGUI()	
	{	
		setLayout(new FlowLayout());
		setVisible(true);
	 	// setSize(400,400);
		lb=new JLabel();
		lb.setText("Welcome to IIPS");
	 	btn1=new JButton("First");
		btn2=new JButton("Second");
	     lb.setVisible(false);
		add(btn1);
		add(btn2);
		add(lb);
		
		pack();
		
		//welcome to iips
		btn1.addActionListener(new ActionListener(){ 

		public void actionPerformed(ActionEvent ae)
		{					
		  try{
				lb.setVisible(true);
		         	
		   }
		   catch(Exception e) {}	
		}});
		
		// changes color
		btn2.addActionListener(new ActionListener(){ 

		public void actionPerformed(ActionEvent ae)
		{					
		  try{
		        lb.setForeground(Color.red);  	
		   }
		   catch(Exception e) {}	
		}});
		}
		public static void main(String args[])
		{
			ShowGUI ob=new ShowGUI();
		
		}



}