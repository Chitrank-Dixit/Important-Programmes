 /* Extend the  class TwoDim with methods getLength(),getBreadth() which displays the length and breadth of  two dimentional shapes.
 Derive sub-classes  rectangle, rhombus with method getArea() and  getPerimeter() to calculate the area and perimeter of this two dimensional shapes. . */
 
 class Shape
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
	double getArea()
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
	double getPerimeter()
	{
		if(l!=b)
		{
			return (2*(l+b));
		}
		else if(r!=0)
		{
			return (2*Math.PI*r);
		}
		else
		{
			return (4*l);
		}
	
	
	}
	double getLength()
	{
		return l;
	}
	double getBreadth()
	{
		return b;
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
class ShapeMain1
{
	public static void main(String args[])
	{
		TwoDim ob=new TwoDim("Rectangle",12.00,16.00,0);
		double area1=ob.getArea();
		double per=ob.getPerimeter();
		String nm=ob.getName();
		double l=ob.getLength();
		double b=ob.getBreadth();
		
		System.out.println("Name: "+nm+"\nLength: "+l+"\n Breadth: "+b+"\nThe area is : "+area1+"\n perimeter is: "+per);
		
		ThreeDim ob1=new ThreeDim("cuboid",12.00,16.00,0,12.00);
		double area2=ob1.area();
		
		double vol2=ob1.volume();
		ob1.getName();
		ob1.show();
		System.out.println("The area is: "+area2);
		System.out.println("The volume is: "+vol2);
	
	
	}

}