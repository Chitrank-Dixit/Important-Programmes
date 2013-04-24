/* Write an application that reads three nonzero value entered by the user and determines and prints sum, product, average, smallest & largest of three. */
import java.util.*;
class InputCal
{
	public static void main(String args[])
	{
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three Non Zero Numbers: ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		double sum=a+b+c;
		double avg=(a+b+c)/3;
		double product=a*b*c;
		double big=Math.max(a,b);
		double big1=Math.max(big,c);
		double small=Math.min(a,b);
		double small1=Math.min(small,c);
		System.out.println("Sum of the Numbers : "+sum);
		System.out.println("Product of the Numbers : "+product);
		System.out.println("Average of the Numbers : "+avg);
		System.out.println("Smallest of the Numbers : "+small1);
		System.out.println("Biggest of the Numbers : "+big1);
	
	
	}


}