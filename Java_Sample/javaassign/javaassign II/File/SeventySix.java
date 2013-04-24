/* 76 WAP in java to determine whether a file or dir.  */
import java.io.*;
class SeventySix
{
	public static void main(String args[])
	{
		File F=new File("CreateFirstFile.txt");
		boolean b=F.isFile();
		boolean b1=F.isDirectory();
		if(b)
			System.out.println("This is a file");
		else if(b1)
			System.out.println("This is a directory");
		else
			System.out.println("Invalid Operation");
		
	
	
	
	
	}



}