public class TestString7 
{
  public static void main(String[] args) 
{
    String str = "Hard Work Promises Success";
    String strreplace = "Fixes";
    String result = str.replaceFirst("Promises", strreplace);
    String result1 = str.replaceAll("Success", strreplace);
    String result2 = str.replace("Work", strreplace);

    System.out.println(result);
    System.out.println(result1);
    System.out.println(result2);

  }

}