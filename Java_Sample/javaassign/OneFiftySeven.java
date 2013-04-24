/*using the Stack class in Java along with the methods push(argument) and pop()*/
import java.util.*;
class OneFiftySeven	
{
	public static void main(String args[])
	{
		Stack Ob=new Stack();
		Stack Ob2=new Stack();
		
		// push some nos in stack
		for(int i=0;i<=10;i++)
			Ob.push(i);
		for(int j=0;j<=20;j++)
			Ob2.push(j);
		
		//pop some nos from Stack
		
		System.out.println("\n Stack in Ob: ");
		for(int i=0;i<=10;i++)
			System.out.print("\n"+Ob.pop());
		System.out.print("\n Stack in Ob1: ");
		for(int j=0;j<=20;j++)
			System.out.print("\n"+Ob2.pop());
	
	
	}


}