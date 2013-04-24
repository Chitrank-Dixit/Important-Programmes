/* 73 WAP in java to create a file. */
import java.io.*;
class SeventyThree
{
	public static void main(String args[]) throws IOException
	{
		
			File F=new File("CreateFirstFile.txt");
			FileOutputStream Fos=new FileOutputStream(F);
			
			String str="Chitrank Dixit";
			byte arr1[]=str.getBytes();
			Fos.write(arr1);
			System.out.println("File Created..");
			
			Fos.close();
			
		
	}
}