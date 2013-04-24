/* 43 Create an abstract class Employee with methods getAmount() which displays the amount paid to employee. 
Reuse this class to calculate  the  amount to be paid to WeeklyEmployeed and HourlyEmployee according to no. of hours
 and total hours for HourlyEmployee and no. of weeks and total weeks for WeeklyEmployee. */
abstract class Employee
{
	
	abstract long getAmount();

}
class WeeklyEmployee extends Employee
{
	int weeks;
	void setData(int weeks)
	{
		this.weeks=weeks;
	}
	long getAmount()
	{
		return (7000*weeks);
	}




}
class HourlyEmployee extends Employee
{
	int hours;
	void setData(int hours)
	{
		this.hours=hours;
	}
	long getAmount()
	{
	
		return (50*hours);
	}



}
class AbstractEmployeeMain
{
	public static void main(String args[])
	{
		WeeklyEmployee ob=new WeeklyEmployee();
		ob.setData(10);
		long amount=ob.getAmount();
		System.out.println("The amount earned is: "+amount);
		HourlyEmployee ob1=new HourlyEmployee();
		ob1.setData(1350);
		amount=ob1.getAmount();
		System.out.println("The amount earned is: "+amount);
		
	
	
	}

}
