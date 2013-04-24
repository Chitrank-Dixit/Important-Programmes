/* WAP in java to sort array of strings */
import java.util.Arrays;
class StringSorting 
{
  public static void main(String[] args)
  {
    String[] sa = new String[] { "d", "e", "a", "c", "g" };
	System.out.println("Before sorting: " + Arrays.asList(sa));
    Arrays.sort(sa);
    System.out.println("After sorting: " + Arrays.asList(sa));
  }
}
