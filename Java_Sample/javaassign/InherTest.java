/* Single Inheritance */
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
class InherTest
{
	static public void main(String args[])
	{
		BedRoom r1=new BedRoom(14,12,10);
		int a1=r1.area(); // super class method
		int v1=r1.volume();  // derived class method
		
		System.out.println("Area : "+a1);
		System.out.println("Volume: "+v1);
	}

}