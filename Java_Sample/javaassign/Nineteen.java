/* Write an application that finds the substring from any given string using substring method and startsWith & endsWith methods.*/
class Nineteen
{
	public static void main(String args[])
	{
		String s="Time never stops";
		String s1=s.substring(1,12);
		System.out.println("The above substring is: "+s1);
		boolean b=s.startsWith("Time");
		System.out.println("Does string starts with Time: "+b);
		b=s.endsWith("stops");
		System.out.println("Does string ends with stops: "+b);
	
	
	
	
	}


}