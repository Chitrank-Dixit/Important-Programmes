/* Write another method debit in the above program that withdraws money from an Account. Ensure that the debit amount does not exceed the Account’s balance.
 In that case the balance should be left unchanged and the method should print a message indicating “Debit amount exceeded account balance”.
 Modify class AccountTest to test method debit. */
import java.util.*;
class Account
{
	double balance;
	double credit;
	double debit;
	Account(double balance,double credit,double debit)
	{
		this.balance=balance;
		this.credit=credit;
		this.debit=debit;
	}
	double credit()
	{
		double c=credit+balance;
		return c;
	}
	double getBalance()
	{
		return balance;
	}
	double getDebit()
	{
		return debit;
		
	}

}
class AccountMain28
{
	public static void main(String args[])
	{
		double bal=123456;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the value of debit: ");
		double deb=Sc.nextDouble();
		if(deb<bal)
		{
		Account a=new Account(bal,2345,deb);
				double cre=a.credit();
			double g=a.getBalance();
			System.out.println("The balance is: "+g);
			System.out.println("The Credited balance is: "+cre);
		}
		else
		{
			System.out.println("The value of debit exceeds balance");
		
		}
	
	}


}