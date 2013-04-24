/* The following program is three dimensional array programme*/
class ThreeDArray
{
	public static void main(String args[])
	{
		int threed[][][]=new int[4][5][6];
		int i,j,k;
		for(i=0;i<threed.length;i++)
			for(j=0;j<threed[i].length;i++)
				for(k=0;k<threed[i][j].length;k++)
					threed[i][j][k]=i*j*k;
		
		for(i=0;i<threed.length;i++)
		{
			for(j=0;j<threed[i].length;j++)
			{
				for(k=0;k<threed[i][j].length;k++)
					System.out.print(threed[i][j][k]+" ");
					System.out.println();
			}
			System.out.println();
		}		
					
	
	
	
	}



}