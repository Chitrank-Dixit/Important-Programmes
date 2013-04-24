/*Write an application that uses String method charAt to reverse the string.*/
class Eighteen
{
	public static void main(String args[])
	{
		
		String find="Microsoft";
		int len=find.length();
		char c;
		for(int j=len-1;j>=0;j--)
			{
			c=find.charAt(j);
			System.out.print(c);
			}
		
		
	}



}