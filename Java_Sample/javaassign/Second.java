/* 
State the order of evaluation of the operations in each of the following Java statements and implement them to show the value of x after each statement.
x = 7 + 3 * 6 / 2 – 1;   x = 2 % 2 + 2 * 2 – 2 / 2;   x = ( 3 * 9 * ( 3 + ( 9 * 3 / (3) ) ) ); 


*/
/*
x = 7 + 3 * 6 / 2 – 1;
x=7+18/2-1;
x=7+9-1;
x=16-1;
x=15;
*/
/*
x=2%2+2*2-2/2;
x=2%2+4-2/2;
x=2%2+4-1;
x=0+4-1;
x=3;
*/
/*
x=(3*9*(3+(9*3/(3))));
x=(3*9*(3+(27/3)));
x=(3*9*(3+9));
x=(3*9*12);
x=324;



*/

class Second
{
	public static void main(String args[])
	{
		int x=7+3*6/2-1;
		System.out.println("For First Operation X= "+x);
		x=2%2+2*2-2/2;
		System.out.println("For Second Operation X= "+x);
		x=(3*9*(3+(9*3/(3))));
		System.out.println("For Third Operation X= "+x);
	
	
	
	
	}



}