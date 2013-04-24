/* Derive sub-classes of  ContractEmployee namely HourlyEmployee & WeeklyEmployee with information number of hours & wages per hour, number of weeks & wages per week respectively  & method calculateWages() to calculate their monthly salary. 
Also override getDesig () method depending on the type of contract employee.   */
class Employee
{
	private String firstName;
	private String lastName;
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
}
class ContractEmployee extends Employee
{
	String depart;
	String desig;
	double salary;
	public void setDepartment(String depart)
	{
		this.depart=depart;
	}
	public void setDesignation(String desig)
	{
		this.desig=desig;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getDepartment()
	{
		return depart;
	}
	public String getDesignation()
	{
		return desig;
	}
	public double getSalary()
	{
		return salary;
	}
	public void dispFullName()
	{
		System.out.println(getFirstName()+getLastName());
	}
}
class RegularEmployee extends Employee
{
	String depart;
	String desig;
	double salary;
	public void setDepartment(String depart)
	{
		this.depart=depart;
	}
	public void setDesignation(String desig)
	{
		this.desig=desig;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public String getDepartment()
{
		return depart;
	}
	public String getDesignation()
	{
		return desig;
	}
	public double getSalary()
	{
		return salary;
	}
	public void dispFullName()
	{
		System.out.print(getFirstName() + " " + getLastName());
	}
}
class HourlyEmployee extends ContractEmployee
{
	int noOfHrs;
	double wagesPerHrs;
	public void setHours(int noOfHrs)
	{
		this.noOfHrs=noOfHrs;
	}
	public void setWages(double wagesPerHrs)
	{
		this.wagesPerHrs=wagesPerHrs;
	}
	public double calculateSalary()
	{
		return noOfHrs*wagesPerHrs;
	}
	public String getDesignation()
	{
		return "HourlyEmployee";
	}
               }
class WeeklyEmployee extends ContractEmployee
{
	int noOfWeeks;
	double wagesPerWeek;
	public void setWeeks(int noOfWeeks)
	{
		this.noOfWeeks=noOfWeeks;
	}
	public void setWages(double wagesPerWeek)
	{
		this.wagesPerWeek=wagesPerWeek;
	}
	public double calculateSalary()
	{
		return noOfWeeks*wagesPerWeek;
	}
	public String getDesignation()
	{
		return "WeeklyEmployee";
	}
}
class EmployeeTime
{
	public static void main(String args[])
	{
		HourlyEmployee hg=new HourlyEmployee();
		hg.setFirstName("Steve");
		hg.setLastName("Jobs");
		hg.setDepartment("Sales");
		hg.setDesignation("CEO");
		hg.setSalary(1500000);
		
		String dep=hg.getDepartment();
		String desg=hg.getDesignation();
		double sal=hg.getSalary();
		
		System.out.println("Department : "+dep);
		System.out.println("Designation : "+desg);
		System.out.println("Salary : "+sal);
		hg.dispFullName();
		
		
		hg.setHours(10);
		hg.setWages(1000);
		sal=hg.calculateSalary();
		desg=hg.getDesignation();
		System.out.println("Employee salary: "+sal);
		System.out.println("Employee desg: "+desg);
		
		WeeklyEmployee wg=new WeeklyEmployee();
		
		wg.setFirstName("Bill");
		wg.setLastName("Gates");
		wg.setDepartment("Finance");
		wg.setDesignation("President");
		wg.setSalary(1500000);
		
		dep=wg.getDepartment();
		desg=wg.getDesignation();
		sal=wg.getSalary();
		
		System.out.println("Department : "+dep);
		System.out.println("Designation : "+desg);
		System.out.println("Salary : "+sal);
		wg.dispFullName();
		wg.setWeeks(10);
		wg.setWages(50000);
		sal=wg.calculateSalary();
		desg=wg.getDesignation();
		System.out.println("Employee salary: "+sal);
		System.out.println("Employee desg: "+desg);
	}

}
