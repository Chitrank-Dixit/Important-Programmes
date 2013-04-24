/* Write an application to create a super class Vehicle with information vehicle number,insurance number,color and methods getConsumption() and displayConsumption(). 
Derive  the sub-classes TwoWheeler and FourWheeler  with method maintenance() and average() to print the maintenance
And average of vehicle.
 */
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
 class VehicleMain
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
		
	
	}
 
 }