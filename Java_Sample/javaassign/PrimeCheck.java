/* WAP to determine whether an entered number is prime or not. */
class PrimeCheck
{
	void prime(int a)
	{
		boolean b1;
		for(int i=1;i<a;i++)
		{
			if(i%a==0)
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
	}
	public static void main(String args[])
	{
		PrimeCheck ob=new PrimeCheck();
		ob.prime(3);
	
	
	}


	
}