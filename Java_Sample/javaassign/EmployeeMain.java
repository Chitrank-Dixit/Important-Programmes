// This is program No 21
/*Create a class called Employee that includes three pieces of information as instance variables – a first name (type String), a last name (type String) and a monthly salary (double)*/
class Employee
{
	String fname;
	String lname;
	double sal;
	
	void setData(String fname,String lname,double sal)
	{
		this.fname=fname;
		this.lname=lname;
		this.sal=sal;
		
	
	}
	void show()
	{
		System.out.println("First name: "+fname);
		System.out.println("Last name: "+lname);
		System.out.println("Salary: "+sal);
	
	}



}
class EmployeeMain
{
	static
	{
		System.out.println("Hello this is the programme with Employee class with employee's first name , last name and salary");
	
	}
	public static void main(String args[])
	{
		Employee Em=new Employee();
		String fn="Chitrank";
		String ln="Dixit";
		double sl=54664.987;
		Em.setData(fn,ln,sl);
		Em.show();
		
	
	
	}


}