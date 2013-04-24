// 130 WAP in java to sum two 2-D matrix and store the result into third matrix.
import java.util.*;
class MatrixAddition
{
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int al=a.length;
		int bl=b.length;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the values of two arrays of size [2][2]");
		for(int i=0;i<al;i++)
		{
			for(int j=0;j<al;j++)
			{
				a[i][j]=Sc.nextInt();
			}
		}
		for(int i=0;i<bl;i++)
		{
			for(int j=0;j<bl;j++)
			{
				b[i][j]=Sc.nextInt();
			}
		}
		for(int i=0;i<al;i++)
		{
			for(int j=0;j<al;j++)
			{
				
				System.out.print("\t "+(a[i][j]+b[i][j]));
			}
		
		}
	
	
	
	
	}




}