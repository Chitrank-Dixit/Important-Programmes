// pyramid of numbers
class OneFiftyFive
{
	public static void main(String args[])
	{
		int n,c,d,num=1,space;
		n=6;
 
      space = n - 1;
 
      for ( d = 1 ; d <= n ; d++ )
      {
          num = d;
 
          for ( c = 1 ; c <= space ; c++ )
              System.out.print(" ");
 
          space--;
 
          for ( c = 1 ; c <= d ; c++ )
          {
              System.out.print(""+num);
              num++;
          }
          num--;
          num--;
          for ( c = 1 ; c < d ; c++)
          {
              System.out.print(""+num);
              num--;
          }
          System.out.print("\n");
 
      }
	
	}


}
