/* Add another method in the above program circlePerimeter to calculate the perimeter of the circle. */
import java.util.*;
class AreaCirclePer
{
	double circleArea(double radius)
	{
		return(Math.PI*radius*radius);
	
	}
	double circumference(double radius)
	{
		return(2*Math.PI*radius);
	}
	public static void main(String args[])
	{
		AreaCirclePer ob=new AreaCirclePer();
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle: ");
		double r=Sc.nextDouble();
		double area=ob.circleArea(r);
		System.out.println("The area of the circle is: "+area);
		double per=ob.circumference(r);
		System.out.println("Circumference of Circle: "+per);
	
	
	
	}



}