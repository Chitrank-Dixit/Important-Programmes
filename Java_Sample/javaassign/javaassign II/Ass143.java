/* 143 Create a GUI with title  STUDENT which has labels roll no., name, class, address with textboxes for taking input from the user(without any functionality). */
import java.awt.*;

import javax.swing.*;

//import java.awt.event;

class Ass143 extends JFrame 
{
    String S = "Student info ";
   JLabel l1,l2,l3,l4;
  JTextField t1,t2,t3,t4;
   
  
  Ass143()
  {
        

        l1 =  new JLabel("Roll No.");
        l2 =  new JLabel("Name");
        l3 =  new JLabel("Class");
        l4 =  new JLabel("Address");
        
  
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        t4 = new JTextField(10);

        add(l1);
        
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
               setSize(200,300);
       setLayout(new FlowLayout());
       setTitle("Student");

  }
  public static void main(String args[])
  {
    Ass143 in =new Ass143();
    in.setVisible(true);
    in.setLocation(300,300);
  }
}