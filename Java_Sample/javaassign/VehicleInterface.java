/* 45 Create an Interface Vehicle  with method getColor(),getNumber(),getConsumption().
 Calculate the fuel consumed, name and color for TwoWheeler and FourWheeler by implementing interface Vehicle. */
interface Vehicle
{
	public String getColor();
	public int getNumbers();
	public double getConsumption();
	

}
class TwoWheeler implements Vehicle
{
	String name;
	String color;
	int number;
	double fuelcon;
	void setData(String name,String color,int number,double fuelcon)
	{
		this.name=name;
		this.color=color;
		this.number=number;
		this.fuelcon=fuelcon;
	}
	public String getName()
	{
		return name;
	}
	public String getColor()
	{
		return color;
	}
	public int getNumbers()
	{
		return number;
	}
	public double getConsumption()
	{
		return fuelcon;
	}
}
class FourWheeler implements Vehicle
{
	String name;
	String color;
	int number;
	double fuelcon;
	void setData(String name,String color,int number,double fuelcon)
	{
		this.name=name;
		this.color=color;
		this.number=number;
		this.fuelcon=fuelcon;
	}
	public String getName()
	{
		return name;
	}
	public String getColor()
	{
		return color;
	}
	public int getNumbers()
	{
		return number;
	}
	public double getConsumption()
	{
		return fuelcon;
	}

}
class VehicleInterface
{
	public static void main(String args[])
	{
	TwoWheeler ob=new TwoWheeler();
	ob.setData("Splendour","Black Blue",1490,500.12);
	String name=ob.getName();
	String color=ob.getColor();
	int num=ob.getNumbers();
	double cons=ob.getConsumption();
	System.out.println("\n Name : "+name+"\n Color : "+color+"\n Number : "+num+"\n Consumption : "+cons);
	FourWheeler ob1=new FourWheeler();
	ob1.setData("Buggatti","Vibrant Red",9900,80000);
	 name=ob1.getName();
	 color=ob1.getColor();
	 num=ob1.getNumbers();
	 cons=ob1.getConsumption();
	System.out.println("\n Name : "+name+"\n Color : "+color+"\n Number : "+num+"\n Consumption : "+cons);
	}
	


}