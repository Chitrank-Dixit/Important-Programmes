/* Exception Handling program for ClassNotFoundException--thrown if a program can not find a class it depends at runtime 
(i.e., the class's ".class" file cannot be found or was removed from the CLASSPATH)  */
import packallclasses.First;
class ExceptionTest5
{
	
	
	
	public static void main(String args[])
	{
		try
		{
			First f=new First();
			f.displayFirst();
		
		 
		
		
		}
		catch(Exception e)
		{
			System.out.println("Error found"+e.getMessage());
		}
	
	
	
	
	}





}