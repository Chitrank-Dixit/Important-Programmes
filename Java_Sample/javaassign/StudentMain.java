/* Create a super class Student with methods getQual (), getFirstName(),getLastName(), getAddress(), getContat(), which gives basic details of student.
derive sub-classes  Faculty and Scholar with method salary(), Course() resp. 
which gives the additional information about the salary and course of faculty and scholar resp. . */
class Student
{
	String fnm,lnm,address,contact,qual;
	Student(String fnm, String lnm,String address,String contact,String qual)
	{
		this.fnm=fnm;
		this.lnm=lnm;
		this.address=address;
		this.contact=contact;
		this.qual=qual;
	
	
	
	}
	String getQual()
	{
		return qual;
	}
	String getFirstName()
	{
		return fnm;
	}
	String getLastName()
	{
		return lnm;
	}
	String getAddress()
	{
		return address;
	}
	String getContact()
	{
		return contact;
	}
	
	
	

}
class Faculty extends Student
{
	String fnm,lnm,address,contact,qual,course;
	double salary;
	Faculty(String fnm, String lnm,String address,String contact,String qual,String course1,double salary1)
	{
		super(fnm,lnm,address,contact,qual);
		course=course1;
		salary=salary1;
	
	}
	double getSalary()
	{
		return salary;
	}
	String getCourse()
	{
		return course;
	}
}
class Scholar extends Student
{
	String fnm,lnm,address,contact,qual,course;
	double salary;
	Scholar(String fnm, String lnm,String address,String contact,String qual,String course1,double salary1)
	{
		super(fnm,lnm,address,contact,qual);
		course=course1;
		salary=salary1;
	
	}
	double getSalary()
	{
		return salary;
	}
	String getCourse()
	{
		return course;
	}
}
class StudentMain
{
	public static void main(String args[])
	{
		Faculty f=new Faculty("James", "Gosling","Calagri Canada","9898989898","Made Java","CS",1200000.00);
		String nm=(f.getFirstName()+f.getLastName());
		String add=f.getAddress();
		String qual=f.getQual();
		String cont=f.getContact();
		String cour=f.getCourse();
		double sal=f.getSalary();
		System.out.println("Name: "+nm+"\n Address: "+add+"\n Qualification: "+qual+"\n Contact: "+cont+"\n Course: "+cour+"\n Salary: "+sal);
		Scholar s=new Scholar("Andres","Hijlesberg","Denmark","9999999999","Made C#","CS",1200000.00);
		 nm=(s.getFirstName()+s.getLastName());
		 add=s.getAddress();
		 qual=s.getQual();
		 cont=s.getContact();
		 cour=s.getCourse();
		 sal=s.getSalary();
		System.out.println("Name: "+nm+"\n Address: "+add+"\n Qualification: "+qual+"\n Contact: "+cont+"\n Course: "+cour+"\n Salary: "+sal);
	}
	
}