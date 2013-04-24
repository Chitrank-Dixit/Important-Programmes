/* 86 WAP in java to demonstrate StringTokenizer class.   */
import java.util.StringTokenizer;
class STDemo 
{
	static String in = "title=Java: The Complete Reference;" +
	"author=Schildt;" +
	"publisher=Osborne/McGraw-Hill;" +
	"copyright=2007";


	public static void main(String args[]) 
	{
		StringTokenizer st = new StringTokenizer(in, "=;");
		while(st.hasMoreTokens()) 
		{
			String key = st.nextToken();
			String val = st.nextToken();
			System.out.println(key + "\t" + val);
		}
	}
}