/* Function Overloading in Java*/
class OverloadDemo
{
	void test()
	{
		System.out.print("\n No Parameter");
	}
	// Overloaded test for the integer Parameters
	void test(int a)
	{
		System.out.print("\n a= "+a);
	}
	// Overloaded test for two integers
	void test(int a,int b)
	{
		System.out.print("\n a & b "+a+" "+b);
	}
	// Overloaded method test for double parameter
	double test(double a)
	{
		System.out.print("\n double a: "+a);
		return (a*a);
	}

}
class OneFiftyEight
{
	public static void main(String args[])
	{
		OverloadDemo Ob=new OverloadDemo();
		double result;
		Ob.test();
		Ob.test(10);
		Ob.test(10,20);
		result=Ob.test(123.25);
		System.out.print("\n Result of Ob.test(123.25) "+result);
	
	
	}


}