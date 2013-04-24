/* Multilevel Inheritance */
class Room
{
	int length;
	int breadth;
	Room()
	{
		System.out.println("We are in Default Constructor...");
		
	}
	Room(int x,int y)
	{
		length=x;
		breadth=y;
		
	}
	int area()
	{
		return (length*breadth);
	}



}
class BedRoom extends Room
{
	int height;
	BedRoom(int x,int y,int z)
	{
		super(x,y); // pass the value to super class
		height=z;
	}
	int volume()
	{
		return(length*breadth*height);
	}
	

}
class MyRoom extends BedRoom
{
	int radius;
	
	MyRoom(int x,int y,int z,int r)
	{
		super(x,y,z);
		
		radius=r;
	}
	double vol()
	{
		return(radius*radius*height*(Math.PI));
	
	}
}
class InherTest1
{
	static public void main(String args[])
	{
		
		MyRoom s1=new MyRoom(11,10,12,14); 
		int a1=s1.area(); // super class method
		int v1=s1.volume();  // derived class method
			 
		double d=s1.vol();
		System.out.println("Area : "+a1);
		System.out.println("Volume: "+v1);
		System.out.println("Volume: "+d);
		
	}

}