/* 139 Create a GUI with a text field and three buttons. When you press each button, make some different text appear in the text field. */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Ass139 extends JFrame implements ActionListener
{
	JLabel l1;
	JButton b1,b2,b3;
	JTextField t1;
	
	Ass139()
	{
		l1=new JLabel("OUTPUT");
		b1=new JButton("BUTTON 1");
		b2=new JButton("BUTTON 2");
		b3=new JButton("BUTTON 3");
		t1=new JTextField(10);
		
		add(l1);
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		setSize(200,200);
		setLayout(new FlowLayout());
		setTitle("Assignment 139");
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			t1.setText("Button 1 is pressed");
			
		}
		if(ae.getSource()==b2)
		{
			t1.setText("Button 2 is pressed");
			
		}
		if(ae.getSource()==b3)
		{
			t1.setText("Button 3 is pressed");
			
		}
		
	}

	public static void main(String args[])
	{
		Ass139 a=new Ass139();
		a.setVisible(true);
		a.setLocation(200,200);
		
	}

}
