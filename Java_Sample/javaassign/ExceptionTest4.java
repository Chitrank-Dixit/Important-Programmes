/* Exception Handling program for NumberFormatException--thrown if a program is attempting to convert a string to a numerical datatype, 
and the string contains inappropriate characters (i.e. 'z' or 'Q')  */
class ExceptionTest4
{
	
	
	
	public static void main(String args[])
	{
		try
		{
		 String s="Chitrank";
		 int i=Integer.parseInt(s);
		 
		
		
		}
		catch(NumberFormatException e)
		{
			System.out.println("Error found"+e.getMessage());
		}
	
	
	
	
	}





}