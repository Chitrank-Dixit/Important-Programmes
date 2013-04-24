/* Create class AccountTest to create and manipulate an Account object. */
class Account
{
	double balance;
	Account(double balance)
	{
		this.balance=balance;
	}
	void show()
	{
		System.out.println("The balance is : "+balance);
	}

}
class AccountTest
{
	public static void main(String args[])
	{
		Account a=new Account(123456.76543);
		a.show();
		
		
	
	}


}