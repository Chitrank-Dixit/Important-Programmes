/* Create a super class CommunityMember with the information of member i.e. name, address, contact, date_of_join, through methods getName (),
 getAddress (), getContact (), getDate_of_Join () and derive sub-classes Employee and Student with method Qualification () to
 print the related information with his/her qualification. */
 class CommunityMember
 {
	String nm;
	String address;
	String contact;
	String date;
	CommunityMember(String nm,String address,String contact,String date)
	{
		this.nm=nm;
		this.address=address;
		this.contact=contact;
		this.date=date;
	}
	String getName()
	{
		return nm;
	}
	String getAddress()
	{
		return address;
	}
	String getContact()
	{
		return contact;
	}
	String getDate()
	{
		return date;
	}
	
	
 }
 class Employee extends CommunityMember
 {
	String qual;
	String nm;
	String address;
	String contact;
	String date;
	Employee(String qual,String nm,String address,String contact,String date)
	{
		super(nm,address,contact,date);
		this.qual=qual;
	}
	String getQualification()
	{
		return qual;
	}
 }
 class Student extends CommunityMember
 {
	String qual;
	String nm;
	String address;
	String contact;
	String date;
	Student(String qual,String nm,String address,String contact,String date)
	{
		super(nm,address,contact,date);
		this.qual=qual;
	}
	String getQualification()
	{
		return qual;
	}
 }
 class CommunityMemberMain
 {
	public static void main(String args[])
	{
		Student s=new Student("MCA","Chitrank","vyas fala","9893194000","18 feb");
		
		String qual=s.getQualification();
		String name=s.getName();
		String address=s.getAddress();
		String contact=s.getContact();
		String date=s.getDate();
		System.out.println("\n Qualification: "+qual+"\n Name: "+name+"\n Address: "+address+"\n Contact: "+contact+"\n Date: "+date);
		
		Employee e=new Employee("MCA","Arpit","badi gwal toli","9424841743","22 feb");
		 qual=e.getQualification();
		 name=e.getName();
		 address=e.getAddress();
		 contact=e.getContact();
		 date=e.getDate();
		System.out.println("\n Qualification: "+qual+"\n Name: "+name+"\n Address: "+address+"\n Contact: "+contact+"\n Date: "+date);
		
	}
 
 }