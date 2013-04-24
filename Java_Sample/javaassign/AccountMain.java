/* Create a class Account with an instance variable balance (double). It should 
contain a constructor that initializes the balance, ensure that the initial balance is greater than 0.0. */
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
class AccountMain
{
	public static void main(String args[])
	{
		Account a=new Account(123456.76543);
		a.show();
		
		
	
	}


}