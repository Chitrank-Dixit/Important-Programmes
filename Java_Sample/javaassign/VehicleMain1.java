/* Extend the above  TwoWheeler class with methods getType() and getName() which gives the information about the type and the name of the company.
Create sub-classes  Geared and NonGeared with method average() to print the average of a geared and non-geared two wheeler. */
class Vehicle
 {
	int vno;
	int ino;
	String color;
	double fuel;
	void setInfo(int vno,int ino,String color)
	{
		this.vno=vno;
		this.ino=ino;
		this.color=color;
		
	}
	void getConsumption(double fuel)
	{
		this.fuel=fuel;
	}
	void displayConsumption()
	{
		System.out.println("Fuel Comsumption : "+fuel);
	}
	void displayInfo()
	{
		System.out.println("Vehicle no:  "+vno);
		System.out.println("Insurance no:  "+ino);
		System.out.println("Color:  "+color);
	}
	
	
 
 }
 class TwoWheeler extends Vehicle
 {
		double avg;
		double mt;
		void setSpecs(double avg,double mt)
		{
			this.avg=avg;
			this.mt=mt;
		}
		double getMaintenance()
		{
			return mt;
		}
		double getAverage()
		{
			return avg;
		}
 }
 class FourWheeler extends Vehicle
 {
		double avg;
		double mt;
		void setSpecs(double avg,double mt)
		{
			this.avg=avg;
			this.mt=mt;
		}
		double getMaintenance()
		{
			return mt;
		}
		double getAverage()
		{
			return avg;
		}
 }
 class Geared extends TwoWheeler
 {
	String type;
	String name;
	Geared(String type,String name)
	{
		this.type=type;
		this.name=name;
	}
	String getType()
	{
		return type;
	}
	String getName()
	{
		return name;
	}
 }
 class NonGeared extends TwoWheeler
 {
	String type;
	String name;
	NonGeared(String type,String name)
	{
		this.type=type;
		this.name=name;
	}
	String getType()
	{
		return type;
	}
	String getName()
	{
		return name;
	}
 }
 class VehicleMain1
 {
	public static void main(String args[])
	{
		TwoWheeler tw=new TwoWheeler();
		tw.setInfo(1490,123432,"Black");
		tw.getConsumption(5);
		tw.setSpecs(55,1200);
		double m=tw.getMaintenance();
		double av=tw.getAverage();
		System.out.println("For Two Wheelers");
		tw.displayInfo();
		tw.displayConsumption();
		System.out.println("Maintenance:  "+m);
		System.out.println("Average: "+av);
		FourWheeler fw=new FourWheeler();
		fw.setInfo(9000,876646,"Red");
		fw.getConsumption(10);
		fw.setSpecs(20,5000);
		m=fw.getMaintenance();
		av=fw.getAverage();
		System.out.println("For Four Wheelers");
		fw.displayInfo();
		fw.displayConsumption();
		System.out.println("Maintenance:  "+m);
		System.out.println("Average: "+av);
		
		
		// extende new
		Geared g=new Geared("Geared","Motorcycle");
		String type=g.getType();
		String name=g.getName();
		System.out.println("\n Type : "+type+"\n Name: "+name);
		NonGeared ng=new NonGeared("Non Geared","Scootec");
		 type=ng.getType();
		 name=ng.getName();
		 System.out.println("\n Type : "+type+"\n Name: "+name);
	
	}
 
 }