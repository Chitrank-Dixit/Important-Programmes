// using static method
class UsingStaticFunction
{
	static int perform(int a)
	{
		return(a*a);
	
	}
	public static void main(String args[])
	{
		UsingStaticFunction Us=new UsingStaticFunction();
		int a=10;
		int b=Us.perform(a);
		System.out.println(b);
	
	}

}