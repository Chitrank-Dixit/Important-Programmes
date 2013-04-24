/* Create a constructor in above class to initialize the three instance variables. Provide a get method for each instance variable.  */
class Employee1
{
	String fname;
	String lname;
	double sal;
	Employee1(String fname,String lname,double sal)
	{
		this.fname=fname;
		this.lname=lname;
		this.sal=sal;
		
	}
	String getFname()
	{
	
		return fname;
	}
	String getLname()
	{
	
		return lname;
	}
	double getSal()
	{
		return sal;
	}
	



}
class EmployeeMain1
{
	public static void main(String args[])
	{
		Employee1 Em=new Employee1("Chitrank","Dixit",54664.987);
		
		String fn=Em.getFname();
		String ln=Em.getLname();
		double sal=Em.getSal();
		System.out.println("\n First Name: "+fn+"\n Last Name: "+ln+"\n Salary: "+sal);
		Employee1 Em1=new Employee1("Ram","Dixit",54990.987);
		 fn=Em1.getFname();
		 ln=Em1.getLname();
		 sal=Em1.getSal();
		System.out.println("\n First Name: "+fn+"\n Last Name: "+ln+"\n Salary: "+sal); 
		
		Employee1 Em2=new Employee1("Shyam","Dixit",56000.987);
		 fn=Em2.getFname();
		 ln=Em2.getLname();
		 sal=Em2.getSal();
		System.out.println("\n First Name: "+fn+"\n Last Name: "+ln+"\n Salary: "+sal);
	
	
	
	
	
	}


}