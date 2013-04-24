/* Write an application that reads a five digit integer and determine whether it is a palindrome (digit that reads the same backward and forward eg. 12321, 45554 etc.) . 
display an error message, if the number is no5 five digits long and allow the user to enter a new value. */
import java.util.*;
class PalindromeEg
{
	public static void main(String args[])
	{
		Scanner acn = new Scanner(System.in);
		int ch=0;
		while(true)
		{
			System.out.print("Enter A Five Digit Number : ");
			int no=acn.nextInt();
			String sno=String.valueOf(no);
			if(sno.length()<5)
			{
				System.out.print("Length Is Less Than 5 Digit. Continue?(0)Yes/(1)No");
				ch=acn.nextInt();
				if(ch==1)
				              break;
			}
			else
			{
				boolean flag=true;
				int i=0;
				int len=sno.length();
				for(i=0;i<sno.length()/2;i++)
				{
					if(sno.charAt(i)!=sno.charAt(len-1))
						flag=false;
					len--;
				}
				if(flag)
					System.out.println("Number Is Palindrome");
				else
					System.out.println("Number Is Not Palindrome");
				System.out.print("Continue?(0)Yes/(1)No");
				ch=acn.nextInt();
				if(ch==1)
					break;
			}
		}
	} 
}
