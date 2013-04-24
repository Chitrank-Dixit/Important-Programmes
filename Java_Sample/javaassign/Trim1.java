/* Using Method Trim (not a trim name this program removing all the whitpaces from a program) */
class Trim1
{
	
	public static void main(String args[])
	{
		
		String s1="                  Today is Holiday              ";
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c!=' ')
			{
				System.out.print(c);
			}
		
		}
		
	
	
	}


}