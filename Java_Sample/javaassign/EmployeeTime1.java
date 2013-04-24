/* Write an application to create a super class Employee with information first name & last name and methods getFirstName(), getLastName()
  derive  the sub-classes ContractEmployee and RegularEmployee with the information about department, designation & method displayFullName()
  , getDepartment, getDesig() to print the salary and to set department name & designation of the corresponding sub-class objects respectively.    */
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
class EmployeeTime1
{
	public static void main(String args[])
	{
		ContractEmployee Ct=new ContractEmployee();
		Ct.setFirstName("Steve");
		Ct.setLastName("Jobs");
		Ct.setDepartment("Sales");
		Ct.setDesignation("CEO");
		Ct.setSalary(1500000);
		String fnm=Ct.getFirstName();
		String lnm=Ct.getLastName();
		String dep=Ct.getDepartment();
		String desg=Ct.getDesignation();
		double sal=Ct.getSalary();
		System.out.println("First Name : "+fnm);
		System.out.println("Last Name : "+lnm);
		System.out.println("Department : "+dep);
		System.out.println("Designation : "+desg);
		System.out.println("Salary : "+sal);
		Ct.dispFullName();
		RegularEmployee Rg=new RegularEmployee();
		Rg.setFirstName("Steve");
		Rg.setLastName("Jobs");
		Rg.setDepartment("Sales");
		Rg.setDesignation("CEO");
		Rg.setSalary(1500000);
		String fnm=Rg.getFirstName();
		String lnm=Rg.getLastName();
		String dep=Rg.getDepartment();
		String desg=Rg.getDesignation();
		double sal=Rg.getSalary();
		System.out.println("First Name : "+fnm);
		System.out.println("Last Name : "+lnm);
		System.out.println("Department : "+dep);
		System.out.println("Designation : "+desg);
		System.out.println("Salary : "+sal);
		Rg.dispFullName();
		
	}

}