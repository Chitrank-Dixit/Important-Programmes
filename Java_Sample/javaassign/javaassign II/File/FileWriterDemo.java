/* 80 WAP in java to write into a file using FileWriter. */
import java.io.*;
class FileWriterDemo					
{
	public static void main(String args[]) throws Exception
	{
		File F=new File("abc.txt");
		FileWriter Fw=new FileWriter(F);
		
		char arr1[]=new char[7];
		String str="Great = Google";
		// byte[] b=str.getBytes();
		// str.getChars(0,str.length(),arr,0);
		Fw.write(str);
		
		
		Fw.close();
		
	}
}