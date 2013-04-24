/*Write an application that calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in a table format, a shown below.
Number        Square      Cube
0                    0               0
1                    1               1
2                    4               8   and so on


*/
class Six
{
	public static void main(String args[])
	{
		
		
		
		
		System.out.print("Number\t\tSquare\t\tCube");
		for(int i=0;i<=10;i++)
		{
			System.out.print("\n"+i+"\t\t"+(i*i)+"\t\t"+(i*i*i));
		
		}
	
	
	}
	
}