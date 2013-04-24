/* A mail-order house sells five products whose retail prices are as follows : Product 1 : Rs. 99.90 , Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87 , Product 4 : Rs. 45.50 and Product 5 : Rs. 40.49 . Write an application that reads a series of pairs of numbers as follows :
             a) product number             b) quantity sold
your program use a switch statement to determine the retail price for each product. It should calculate and display the total retail value of all products sold.     
 */
 import java.util.*;
 class Eleven
 {
		String nm;
		double price;
		int quantity;
		
		void setData(String nm,double price,int quantity)
		{
			this.nm=nm;
			this.price=price;
			this.quantity=quantity;
			
		}
		void show()
		{
			System.out.println(" Name of the Product: "+nm);
			System.out.println(" Price of the Product: "+price);
			System.out.println(" Quantity of the Product: "+quantity);
			
		
		}
		double getPrice()
		{
			return (price*quantity);
		}
 
 
 
 }
 class ElevenMain
 {
	public static void main(String args[])
	{
		
		Eleven E=new Eleven();
		Eleven E1=new Eleven();
		Eleven E2=new Eleven();
		Eleven E3=new Eleven();
		Eleven E4=new Eleven();
		E.setData("product 1",99.90,2);
		E1.setData("product 2",20.20,1);
		E2.setData("product 3",6.87,4);
		E3.setData("product 4",45.50,5);
		E4.setData("product 5",40.49,3);
		int i;
		System.out.println(" Please Enter your Choice : ");
		System.out.println("1:  Product 1 Stats ");
		System.out.println("2:  Product 2 Stats ");
		System.out.println("3:  Product 3 Stats ");
		System.out.println("4:  Product 4 Stats ");
		System.out.println("5:  Product 5 Stats ");
		System.out.println("6:  Total Quantities sold ");
		System.out.println("7:  Exit  ");
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter your Choice: ");
		i=Sc.nextInt();
		switch(i)
		{
			case 1: 
					E.show();
					break;
				
			case 2:
					E1.show();
					break;
			case 3:
					E2.show();
					break;
			case 4:
					E3.show();
					break;
			case 5:
					E4.show();
					break;
			case 6:
					double d=E.getPrice()+E1.getPrice()+E2.getPrice()+E3.getPrice()+E4.getPrice();
					System.out.println(d);
					break;
			case 7:
					break;
			
		
		
		}
	
	
	}
 
 
 
 }