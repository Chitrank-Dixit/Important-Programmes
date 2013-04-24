/* Give each employee a 10% raise and display each Employee’s yearly salary again. */
class EmployeeTesting
{
	String nm;
	String des;
	String qual;
	int sal;
	EmployeeTesting(String nm,String des,String qual,int sal)
	{
		this.nm=nm;
		this.des=des;
		this.qual=qual;
		this.sal=sal;
	
	}
	int yearlySal()
	{
		return(sal*12);
	}
	double raise()
	{
		double r=.10*sal;
		double raise=(sal+r)*12;
		return raise;
	}
	


}
class EmployeeTest1
{
	public static void main(String args[])
	{
		EmployeeTesting ob=new EmployeeTesting("Chitrank","President","Programmer",100000);
		int sal=ob.yearlySal();
		
		System.out.println("Yearly Salary of: Mr. "+ob.nm+"\nat designation: "+ob.des+"\nWorks as: "+ob.qual+"\nis: "+sal);
		double raise=ob.raise();
		System.out.println("\nAfter 10% raise in salary: "+raise+" is the salary of: Mr. "+ob.nm);
		EmployeeTesting ob1=new EmployeeTesting("Akhilesh","CEO","System Analyist",54000);
		sal=ob1.yearlySal();
		System.out.println("\nYearly Salary of: Mr. "+ob1.nm+"\nat designation: "+ob1.des+"\nWorks as: "+ob1.qual+"\nis: "+sal);
		raise=ob1.raise();
		System.out.println("\nAfter 10% raise in salary: "+raise+" is the salary of: Mr. "+ob1.nm);
	
	}

}