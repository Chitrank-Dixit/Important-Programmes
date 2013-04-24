/* 50 Exception Handling program for division of two numbers that accepts numbers from user. */
import java.util.*;
class Fifty
{
	public static void main(String args[])
	{
		try{
			int a,b,div;
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter a number to divide from ");
			a=Sc.nextInt();
			System.out.println("Enter a number to divide ");
			b=Sc.nextInt();
			div=b/a;
			System.out.println("The result is: "+div);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
	}


}