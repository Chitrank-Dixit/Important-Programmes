/* Modify the above compound-interest application to repeat its steps for interest rates of 5, 6, 7, 8, 9 and 10%. Use a for loop to vary the interest rate.  */
class Ten
{
	public static void main(String args[])
	{
		double p=25000.00;
		double r=5;
		double t=10.0;
		double n=1.0;
		double fa=0.0;
		
			for(r=5;r<=10;r++)
			{
				fa=p*Math.pow((1+r/100),t);
				System.out.println("The compund Interest for "+r+"% is: "+fa);
				
			}
			
		
		
		
		
	
	
	
	}

}