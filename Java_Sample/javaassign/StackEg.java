/* WAP in java to demonstrate Stack class. */
import java.util.*;
class StackEg
{
	public static void main(String args[])
	{
		Stack ob=new Stack();
		for(int i=0;i<12;i++)
			ob.push(i);
		for(int i=0;i<12;i++)
			System.out.println(ob.pop());
	
	
	}
}