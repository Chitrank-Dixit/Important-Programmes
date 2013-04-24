/* WAP to copy the content of a file to another file. */
import java.io.*;
import java.util.*;
class CopyContentsToAnother			// This class will read the characters associated with the class
{
	
	public void copyFile(String s)throws Exception
	{
		
		File F=new File("SomeOne.txt");
		FileWriter Fw=new FileWriter(F);
		Fw.write(s);
		
		
		Fw.close();
	
	}
	public static void main(String args[]) throws IOException
	{
		File F=new File("abc.txt");
		FileReader Fr=new FileReader(F);
		int x;
		String s=new String();
		while((x=Fr.read())!=-1)
		{
			System.out.print((char) (x));
			s=s+(char)(x);
		}
		StringTokenizer st = new StringTokenizer(s, "=;");
		while(st.hasMoreTokens()) 
		{
			String key = st.nextToken();
			String val = st.nextToken();
			System.out.println(key + "\t" + val);
		}
		CopyContentsToAnother ob=new CopyContentsToAnother();
		try {
		
		ob.copyFile(s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		Fr.close();
		
	}
}