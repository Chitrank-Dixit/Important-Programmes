/* Create an abstract class Shape which calculate the area and volume of 2-d and 3-d shapes with methods getArea and getVolume. 
Reuse this class to calculate the area and volume of square ,circle ,cube. */
abstract class Shape
 {
	String name;
	Shape(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
 
}
class TwoDim extends Shape
{
	double l,b,r;
	String nm;
	TwoDim(String nm,double l1,double b1,double r1)
	{
		super(nm);
		l=l1;
		b=b1;
		r=r1;
		
	}
	double area()
	{
		if(l!=b)
		{
			return (l*b);
		}
		else if(r!=0)
		{
			return (Math.PI*r*r);
		}
		else
		{
			return (l*l);
		}
	}
	void show()
	{
		
		System.out.println("Length : "+l);
		System.out.println("breadth : "+b);
		System.out.println("radius if circle : "+r);
		
	}
	
}
class ThreeDim extends Shape
{
	double l,b,r,h;
	String nm;
	ThreeDim(String nm,double l1,double b1,double r1,double h1)
	{
		super(nm);
		l=l1;
		b=b1;
		r=r1;
		h=h1;
	}
	double area()
	{
		if(l!=b)
		{
			return (2*((l*b)+(b*h)+(h*l)));
		}
		else if(r!=0)
		{
			return (2*Math.PI*r*r);
		}
		else
		{
			return (6*(l*l));
		}
	
	}
	double volume()
	{
		if(l!=b)
		{
			return (l*b*h);
		}
		else if(r!=0)
		{
			return (Math.PI*r*r*h);
		}
		else
		{
			return (l*b*h);
		}
	}
	void show()
	{
		
		System.out.println("Length : "+l);
		System.out.println("breadth : "+b);
		System.out.println("height : "+h);
		System.out.println("radius if circle : "+r);
		
	}
}
class ShapeAbstract
{
	public static void main(String args[])
	{
		TwoDim ob=new TwoDim("Rectangle",12.00,16.00,0);
		double area1=ob.area();
		ob.getName();
		ob.show();
		System.out.println("The area is : "+area1);
		ThreeDim ob1=new ThreeDim("cuboid",12.00,16.00,0,12.00);
		double area2=ob1.area();
		double vol2=ob1.volume();
		ob1.getName();
		ob1.show();
		System.out.println("The area is: "+area2);
		System.out.println("The volume is: "+vol2);
	
	
	}

}