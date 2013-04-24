/*using equals */
class Equals
{
	public static void main(String args[])
	{
		char c1,c2;
		int a1,a2;
		String s1="india";
		String s2="india";
		int len1=s1.length();
		int len2=s2.length();
		if(len1==len2)
		{
			for(int i=0;i<len1;i++)
			{
				
				c1=s1.charAt(i);
				c2=s2.charAt(i);
				a1=(int)(c1);
				a2=(int)(c2);
				if(a1==a2)
				{
					System.out.println("Both are equal: ");
				
				}
				else
				{
					System.out.println("Unequal");
				
				}
				
			
			}
		}
		else
		{
			System.out.println("Not equal");
		
		}
	
	
	}


}