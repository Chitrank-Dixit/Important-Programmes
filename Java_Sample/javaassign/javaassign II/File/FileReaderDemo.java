/* 79 WAP in java to read a file using FileReader and break the contets using StringTokenizer. */
import java.io.*;
import java.util.*;
class FileReaderDemo			// This class will read the characters associated with the class
{
	public static void main(String args[]) throws IOException
	{
		File F=new File("abc.txt");
		FileReader Fr=new FileReader(F);
		int x;
		String s=new String();
		while((x=Fr.read())!=-1)
		{
			System.out.println((char) (x));
			s=s+(char)(x);
		}
		StringTokenizer st = new StringTokenizer(s, "=;");
		while(st.hasMoreTokens()) 
		{
			String key = st.nextToken();
			String val = st.nextToken();
			System.out.println(key + "\t" + val);
		}
		Fr.close();
	}
}
