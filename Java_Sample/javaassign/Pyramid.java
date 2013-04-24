/*Pyramid of numbers*/
class Pyramid
{
	public static void main(String args[])
	{
		int i,k,j;
		int space=7;
		for(i=1;i<=8;i= i*2)
		{
			space--;
			for(j=1; j<=i; j=j*2)
			System.out.print(j + " ");

			for(k=i/2; k>=1; k=k/2)
			System.out.print( k + " ");
			System.out.print("\n");

}


}
}