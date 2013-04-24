/* WAP to demonstrate if…else statement. */
import java.util.*;
class IfElseTest
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=Sc.nextInt();
		if(a!=0)
		{
			System.out.println("The value is non zero: "+a);
		}
		else
		{
			System.out.println("The value is Zero: "+a);
		}
	
	}

}