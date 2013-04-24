/* 46 Create an Interface Fare with method getAmount() to get the amount paid for fare of travelling.
 Calculate the fare paid  by bus and train implementing interface Fare. */
 interface Fare
 {
	double getAmount();
 
 }
 class Bus implements Fare
 {
	double fare;
	double food;
	double sleeper;
	void setFare(double fare,double food,double sleeper)
	{
		this.fare=fare;
	}
	public double getAmount()
	{
		return (fare+food+sleeper);
	}
 
 
 }
 class Train implements Fare
 {
	double fare;
	double food;
	double sleeper;
	void setFare(double fare,double food,double sleeper)
	{
		this.fare=fare;
	}
	public double getAmount()
	{
		return (fare+food+sleeper);
	}
 
 
 }
 class FareInterface
 {
	public static void main(String args[])
	{
		Bus b=new Bus();
		b.setFare(700.50,200.50,300.50);
		double amount=b.getAmount();
		System.out.println("\n Total Amount is : "+amount);
		Train t=new Train();
		t.setFare(1000.50,100.50,200.50);
		amount=t.getAmount();
		System.out.println("\n Total Amount is : "+amount);
	
	
	
	
	}
 
 
 
 }