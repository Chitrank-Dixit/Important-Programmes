/*Write an application that uses String method indexOf to determine the total number of occurrences of any given alphabet in a defined text.*/
class Fifteen
{
	public static void main(String args[])
	{
		String nm="My name is Chitrank Dixit";
		// int len=nm.length;
		
		int a=0;
		boolean b;
		for(int i=0;i<nm.length();i++)
		{
			a=nm.indexOf('i',i);
			if(a!=-1)	
				System.out.println("The Index of the given character is: "+a);
				
			
			
			
		}
		
		
		
	
	}


}