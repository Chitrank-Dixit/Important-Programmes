/* 65 Modify Exercise 2 to also open a text file so you can write text into it. */
import java.io.*;
class ModifyExercise3
{
	public static void main(String args[])throws Exception
	{
		File F=new File("NewFile.txt");
		FileOutputStream Fos=new FileOutputStream(F);
		String str="India is Great";
			byte arr1[]=str.getBytes();
			Fos.write(arr1);
			Fos.close();
	
	
	
	}



}