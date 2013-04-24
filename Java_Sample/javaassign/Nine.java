/* Write an application for calculating Compound-interest (interest rate of 5% for 10 years) with for loop */
class Nine
{
	public static void main(String args[])
	{
		double p=25000.00;
		double r=5;
		double t=0;
		double fa=0.0;
		for(t=1;t<=10;t++)
		{
		fa=p*Math.pow((1+r/100),t);
		}	
		System.out.println("The compund Interest is: "+fa);
	}
}