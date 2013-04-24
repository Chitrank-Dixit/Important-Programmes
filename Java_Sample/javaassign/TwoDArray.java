/*The following program is of two dimensional array */
class TwoDArray
{
	public static void main(String args[])
	{
		double val[][]=new double[3][4];
		val[0][0]=1;
		val[0][1]=2;
		val[0][2]=3;
		val[0][3]=4;
		val[1][0]=4;
		val[1][1]=3;
		val[1][2]=2;
		val[1][3]=1;
		val[2][0]=1;
		val[2][1]=2;
		val[2][2]=3;
		val[2][3]=4;
		for(int i=0;i<val.length;i++)
		{
			for(int j=0;j<val[i].length;j++)
				System.out.print("\t"+val[i][j]);
				System.out.println();
		}
		
	
	
	
	}


}