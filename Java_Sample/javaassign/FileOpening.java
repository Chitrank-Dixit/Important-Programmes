/* 62 Open a text file so that you can read the file one line at a time. Read each line as a String and send the results to System.out. */
import java.io.*;
class FileOpening
{
	public static void main(String args[]) throws Exception
	{
		File f=new File("Chitrank.txt");
		FileInputStream Fis=new FileInputStream(f);
		DataInputStream Dis=new DataInputStream(Fis);
		int x;
		System.out.println(Dis.readLine());
		
		Fis.close();
	
	
	
	
	}


}