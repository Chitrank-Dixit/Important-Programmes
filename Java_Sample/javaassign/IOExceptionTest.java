/* 55 Exception Handling program for IOException--actually contained in java.io, but it is thrown if the JVM failed to open an I/O stream  */
import java.io.*;
class IOExceptionTest
{
	public static void main(String[] args) 
	{
	  
		try{
 
			File F=new File("abc.txt");			
			System.out.println("File name= "+F.getName());
			System.out.println("can Read= "+F.canRead());
			System.out.println("can write= "+F.canWrite());
			System.out.println("path= "+F.getPath());
			System.out.println("Last modified= "+F.lastModified());
			System.out.println("length= "+F.length());
			System.out.println("is file= "+F.isFile());
  
		}
  
		catch(Exception e)
		{
	
			System.out.println(e.getMessage());

		}
  
	}

}