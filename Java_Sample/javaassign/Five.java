/* Write an application that declares two integers, determines whether the first is a multiple of the second and print the result. [ Hint : Use the remainder operator.] */

class Five
{
	public static void main(String args[])
	{
		int a=7,b=49;
		if(b%a==0)
		{
			System.out.println(b+ " is multiple of "+a);
		
		}
		else
		{
		System.out.println(b+ " is not multiple of "+a);
		}
	
	}


}