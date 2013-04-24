/*
Write an application that calculates the product of the odd integers from 1 to 15.
*/
class Seven
{
	public static void main(String args[])
	{
		int a=1;
		for(int i=1;i<=15;i++)
		{
			if(i%2!=0)
			{
				a=a*i;
				System.out.print("\n"+a);
			}
			
		}
		System.out.print("\nProduct of Odd numbers: "+a);
	}


}