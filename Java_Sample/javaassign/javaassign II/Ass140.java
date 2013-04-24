/* 140 Create a GUI application to take input of two numbers(text field) from user. When you press button it should display  sum of the two numbers in a third text box. */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Ass140 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JButton b1;
	JTextField t1,t2,t3;
	
	Ass140()
	{
		l1=new JLabel("INPUT 1");
		l2=new JLabel("INPUT 2");
		l3=new JLabel("OUTPUT");
		b1=new JButton("BUTTON 1");
		
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		
		b1.addActionListener(this);
		
		setSize(200,200);
		setLayout(new FlowLayout());
		setTitle("Assignment 139");
	}

	public void actionPerformed(ActionEvent ae)
	{
		float a,b,c;
		if(ae.getSource()==b1)
		{
			a=Float.parseFloat(t1.getText());
			b=Float.parseFloat(t2.getText());
			c=a+b;
			t3.setText(String.valueOf(c));
			
		}
		
		
	}

	public static void main(String args[])
	{
		Ass140 a=new Ass140();
		a.setVisible(true);
		a.setLocation(200,200);
		
	}

}
