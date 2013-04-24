/* Exception Handling program for NullPointerException--thrown if the JVM attempts to perform an operation on an Object that points to no data, or null  */

class ExceptionTest3
{
	
	void display()
	{
		System.out.println("No exception occured ");
	
	}
	
	public static void main(String args[])
	{
		try
		{
		 ExceptionTest3 ob=null;
		 ob.display();
		 
		
		
		}
		catch(NullPointerException e)
		{
			System.out.println("Error found"+e.getMessage());
		}
	
	
	
	
	}





}