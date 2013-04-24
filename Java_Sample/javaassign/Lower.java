class Lower
{
	public static void main(String args[])
	{
		String str=" Time Never Stops";
		System.out.print("Lower Case: ");
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			//System.out.print(c);
			int a=(int)(c);
		
			
		
			
			//For LOWER Case
			if(a>64 && a<91 )
			{   
				a=a+32;
				c=(char)(a);
			
			if(a!=32)
			System.out.print(c);
			}
			else 
				System.out.print(c);
			}
		
	
	
	
	}



}