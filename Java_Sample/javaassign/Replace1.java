/*user Defined Replace*/
class Replace1
{
	String trans(String old,String new1)
	{
		
		old=new1;
		return old;
	
	}
	public static void main(String args[])
	{
		String s1="rainy day";
		String s11="sunny day";
		System.out.println("Before replace: "+s1);
		Replace1 r=new Replace1();
		String s2=r.trans(s1,s11);
		System.out.println("After replace: "+s2);
		
	
		
	
	
	}



}