import java.util.*;
class MaximumFromArray
{
	public static void main(String args[])
	{
		int a[]=new int[3];
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter three integers: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=Sc.nextInt();
			
		
		}
		for(int i=1;i<a.length;i++)
		{
			int x=a[i];
			int y=a[i-1];
			if(x>y)
				System.out.println(" \n "+x);
			else
				System.out.println(" \n "+y);
		}
		System.out.println("The last value printed is the maximum of the arrays");
	
	
	}
	
}