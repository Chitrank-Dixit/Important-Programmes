/*
Write an application that declares 5 integers, determines and prints the largest and smallest in the group
*/
class Third
{
	public static void main(String args[])
	{
		int a,b,c,d,e;
		a=10;
		b=21;
		c=43;
		d=47;
		e=23;
		int max1=Math.max(a,b);
		int max2=Math.max(c,d);
		int max3=Math.max(max1,max2);
		int max=Math.max(e,max3);
		System.out.println("The maximum is: "+max);
		int min1=Math.min(a,b);
		int min2=Math.min(c,d);
		int min3=Math.min(min1,min2);
		int min=Math.min(e,min3);
		System.out.println("The minimum is: "+min);
		/*
		if((a>b)&&(a>c)&&(a>d)&&(a>e))
		{
			System.out.println("A is the greatest "+a);
		}
		else if((b>a)&&(b>c)&&(b>d)&&(b>e))
		{
			System.out.println("B is the greatest "+a);
		}
		else if((c>b)&&(c>a)&&(c>d)&&(c>e))
		{
			System.out.println("C is the greatest "+c);
		}
		else if((d>b)&&(d>c)&&(d>a)&&(d>e))
		{
			System.out.println("D is the greatest "+d);
		}
		else 
		{
			System.out.println("E is the greatest "+d);
		}
		
		if((a<b)&&(a<c)&&(a<d)&&(a<e))
		{
			System.out.println("A is the smallest "+a);
		}
		else if((b<a)&&(b<c)&&(b<d)&&(b<e))
		{
			System.out.println("B is the smallest "+b);
		}
		else if((c<b)&&(c<a)&&(c<d)&&(c<e))
		{
			System.out.println("C is the smallest "+c);
		}
		else if((d<b)&&(d<c)&&(d<a)&&(d<e))
		{
			System.out.println("D is the smallest "+d);
		}
		else 
		{
			System.out.println("E is the smallest "+e);
		}
		*/
	}
}