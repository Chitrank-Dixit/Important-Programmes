/* 47 Create an Interface StudentFee with method getAmount(), getFirstName(),getLastName(), getAddress(), getContact().
 Calculate the amount paid by the   Hostler and NonHostler student  by  implementing interface StudentFee */
interface StudentFee
{
	double getAmount();
	String getFirstName();
	String getLastName();
	String getAddress();
	String getContact();
	

}
class Hostler implements StudentFee
{
	String fname;
	String lname;
	String address;
	String contact;
	double amount;
	void setData(String fname,String lname,String address,String contact,double amount)
	{
		this.fname=fname;
		this.lname=lname;
		this.address=address;
		this.contact=contact;
		this.amount=amount;
		
	
	}
	public double getAmount()
	{
		return amount;
	}
	public String getFirstName()
	{
		return fname;
		
	}
	public String getLastName()
	{
		return lname;
	}
	public String getAddress()
	{
		return address;
	}
	public String getContact()
	{
		return contact;
	}



}
class NonHostler implements StudentFee
{
	String fname;
	String lname;
	String address;
	String contact;
	double amount;
	void setData(String fname,String lname,String address,String contact,double amount)
	{
		this.fname=fname;
		this.lname=lname;
		this.address=address;
		this.contact=contact;
		this.amount=amount;
		
	
	}
	public double getAmount()
	{
		return amount;
	}
	public String getFirstName()
	{
		return fname;
		
	}
	public String getLastName()
	{
		return lname;
	}
	public String getAddress()
	{
		return address;
	}
	public String getContact()
	{
		return contact;
	}



}
class StudentFeeInterface 
{
	public static void main(String args[])
	{
		Hostler h=new Hostler();
		h.setData("Deepak","Tiwari","Sagar","9584620767",(10000+50000));
		double amount=h.getAmount();
		String fnm=h.getFirstName();
		String lnm=h.getLastName();
		String address=h.getAddress();
		String contact=h.getContact();
		System.out.println("\nFirst Name : "+fnm+"\nLast Name : "+lnm+"\nAddress: "+address+"\nContact : "+contact+"\n Amount :"+amount);
		NonHostler nh=new NonHostler();
		nh.setData("Chitrank","Dixit","Indore","9893194000",(50000));
		 amount=nh.getAmount();
		 fnm=nh.getFirstName();
		 lnm=nh.getLastName();
		 address=nh.getAddress();
		 contact=nh.getContact();
		System.out.println("\nFirst Name : "+fnm+"\nLast Name : "+lnm+"\nAddress: "+address+"\nContact : "+contact+"\n Amount :"+amount);
		
	
	
	
	
	
	}




}