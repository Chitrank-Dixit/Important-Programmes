/* 82  WAP in java to rename a file. */
import java.io.*;
class EightyTwo
{
	public static void main(String args[])
	{
		File F=new File("CreateFirstFile.txt");
		File G=new File("CMPunk.txt");
		boolean rename=F.renameTo(G);
		if(rename)
			System.out.println("The file has been renamed");
	
	
	
	
	}



}