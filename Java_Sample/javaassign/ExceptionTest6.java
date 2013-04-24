/* 57 Program for demonstrating the use of throw, throws & finally - Create a class with a main( ) that throws an object of class Exception inside a try block.
 Give the constructor for Exception a String argument. Catch the exception inside a catch clause and print the String argument.
 Add a finally clause and print a message to prove you were there. */
 class ExceptionTest6
{
	public static void main(String args[])
	{
		int a ;
		
		try
		{
		 a=Integer.parseInt(args[0]);
			ExceptionTest6 ob=new ExceptionTest6();
			int c=ob.show();

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
	int show() throws ArithmeticException
	{
		int a=12,b=0;
		 
		return a/b;
	}



}