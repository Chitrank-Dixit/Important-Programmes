/*Using Two Dimensional Array */
class Var
{
	void perform(int a[][])
	{
		System.out.println("Begin..... ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
					System.out.println(a[i][j]);
		}
	}

}
class TwoDVar
{
	public static void main(String args[])
	{
		int ar[][]={{10,20,30},{1,2,3,4},{40,50,60,70,80}};;
		int ar1[][]={{10,11,12,13,14},{15,16,17,18}};
		Var v=new Var();
		v.perform(ar);
		v.perform(ar1);
	
	
	
	}


}