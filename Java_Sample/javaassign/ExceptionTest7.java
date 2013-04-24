/* 58 Create your own exception class using the extends keyword. Write a constructor for this class that takes a String argument and stores it inside the object with a String reference.
 Write a method that prints out the stored String. Create a try-catch clause to exercise your new exception. */


class UserException extends Exception
{

	UserException(String msg)
	{
		super(msg);

	} 



}

class ExceptionTesting
{

	void display(int x) throws  UserException
	{
		System.out.println("value of x is="+x);

 		throw new UserException("Another Exception Occured");

	}
		


}


class ExceptionTest7
{

	public static void main(String args[])
	{
		ExceptionTesting ob1=new ExceptionTesting();

		try{	

		ob1.display(50);

		}
		catch(UserException e)
		{
			System.out.println("Error found"+e.getMessage());
		
		}

	}




}