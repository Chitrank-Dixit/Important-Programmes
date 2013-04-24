// pyramid of stars
class OneFiftyFour
{
	public static void main(String args[])
	{
		int n, i, j, space, x, num = 1;
		n=6;
        x = n;
        for(i=1;i<=n;i++)
        {
          for(j=1;j<=i;j++)
          {
            System.out.print("*");
            num++;
          }
 
          num--;
		
          for ( j = 1 ; j <= 2*x - 3 ; j++ )
        System.out.print(" ");
 
          x--;
 
          if ( i != n )
          {
             for ( j = 1 ; j <= i  ; j++ )
             {
                System.out.print("*");
                num--;
             }
          }
          else
          {
              num--;
              for ( j = 1 ; j <= i - 1 ; j++ )
              {
                 System.out.print("*");
                 num--;
              }
          }
 
          System.out.print("\n");
          num = 1;
      }    
 
	}

}