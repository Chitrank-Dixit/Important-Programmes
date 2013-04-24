/* write application that take a series of integers in pair(e.g. (a,b)) and find the following
i) Is first one is greater ii) Is both are even iii) They are relatively prime or not
 */
 class Twelve
 {
	void evenOdd(int a,int b)
	{
		if((a%2==0) && (b%2==0))
		{
			System.out.println("Both are even");
		
		}
		else
		{
			System.out.println("Both are odd");
		
		}
	
	}
	void prime(int a,int b)
	{
		boolean b1;
		if(b%a==0)
		{
			b1=false;
			System.out.println("Prime number "+b1);
		}
		else
		{
			b1=true;
			System.out.println("Prime number "+b1);
		}
	
	}
	
	public static void main(String args[])
	{
		Twelve ob=new Twelve();
		
		int a=3;
		int b=7;
		int cal=Math.max(a,b);
		
		System.out.println("The greatest is: "+cal);
		ob.evenOdd(a,b);
		ob.prime(a,b);
		
		
		
		
	
	
	
	
	}
 
 
 }