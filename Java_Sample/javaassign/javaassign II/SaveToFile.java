/* 135 WAP  to create three text boxes and save entered value into a file. done */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

//import java.awt.event;

class SaveToFile extends JFrame 
{
    
   JLabel l1;
  JTextField t1,t2,t3;
  JButton b;
   
  
  public SaveToFile()
  {
        
        l1 =  new JLabel("Click button to save to file");
        b=new JButton("Save To File");
  
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        

        add(l1);
        
        add(t1);
        
        add(t2);
        
        add(t3);
        
        
		add(b);
          setSize(200,300);
       setLayout(new FlowLayout());
       
	   b.addActionListener(new ActionListener(){ 

		public void actionPerformed(ActionEvent ae)
		{					
		  try{
		       File F=new File("SaveToFile.txt");
			FileWriter Fw=new FileWriter(F);
			String s=t1.getText()+" "+t2.getText()+" "+t3.getText();
			Fw.write(s);
			Fw.close();
		   }
		   catch(Exception e) {}	
		}});

  }
  public static void main(String args[])
  {
    SaveToFile in =new SaveToFile();
     in.setVisible(true);
     in.setLocation(300,300);
  }
}