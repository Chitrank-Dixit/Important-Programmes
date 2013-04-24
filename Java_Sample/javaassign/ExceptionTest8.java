/* 59 Write a program to rethrow an exception – Define methods one() & two(). Method two() should initially throw an exception. 
Method one() should call two(), catch the exception and rethrow it Call one() from main() and catch the rethrown exception. */

 class ExceptionTest8
{
	public static void main(String args[])
	{
		int a ;
		
		try
		{
		 a=Integer.parseInt(args[0]);
			ExceptionTest8 ob=new ExceptionTest8();
			int cat=ob.one();

			if(a>50)
				
				throw ( new ArithmeticException("......myMessage...... \n The number is greater than 50"));
		
		System.out.println("no is less then 50  ="+a);
			

		}

		catch(ArithmeticException e)
		{
			System.out.println("Error found"+e.getMessage());
			
		
		}
		finally
		{
			System.out.println("Done .....");
		}


	
	}
	int one()throws ArithmeticException
	{
		ExceptionTest8 ob1=new ExceptionTest8();
		int a=12,b=0;
		int c=ob1.two(a,b);
		return c;
	}
	int two(int a,int b)
	{ 
		int c1=a/b;
		return c1;
	}



}