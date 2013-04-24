/* simple factorial programme in Java */
class Eight
{
	int factorial(int a)
	{
		int fact=1;
		for(int i=a;i>=1;i--)
			fact=fact*i;
		
		return(fact);
	
	}
	public static void main(String args[])
	{
		int a=0;
		Eight F=new Eight();
		for(a=1;a<=5;a++)
		{
			int b=F.factorial(a);
			System.out.println("The factorial of "+a+" is: "+b);
		}
	
	
	
	}


}