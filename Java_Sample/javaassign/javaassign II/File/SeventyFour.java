/* 74 WAP in java to delete a file. */
import java.io.*;
class SeventyFour
{
	public static void main(String args[]) throws IOException
	{
		
			File F=new File("CreateFirstFile.txt");
			
			
			boolean b=F.delete();
			if(b)
				System.out.println("the file has been deleted"+b);
			
			
		
	}
}