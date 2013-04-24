/* 51 Exception Handling program for storing values in array of int or String that results into buffer overflow */
class ExceptionTest2
{
	public static void main(String args[])
	{
		
		try
		{
		int a[]=new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		 for(int i=0;i<a.length;i++)
			{
			  System.out.println(a[i]);
			}
		 
		
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error found"+e.getMessage());
		}
	
	
	
	
	}





}