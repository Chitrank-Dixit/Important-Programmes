/* 84 WAP in java to get file length. */
import java.io.*;
class FileLength
{
	public static void main(String args[]) throws Exception
	{
		File f=new File("Chitrank.txt");
		FileInputStream Fis=new FileInputStream(f);
		DataInputStream Dis=new DataInputStream(Fis);
		int x;
		System.out.println(Dis.readLine());
		long l=f.length();
		System.out.println("The length of the file is: "+l);
		
		Fis.close();
	
	
	
	
	}


}