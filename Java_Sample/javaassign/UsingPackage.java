/*  48 WAP to create your own package. Package should have more than two classes. Write a class that uses the package. */
// set CLASSPATH=;C:\Users\hp\Documents\Important docs\javaassign ... that is just upto a directory where package exists
import packallclasses.First;  // importing all the classes of the package.
import packallclasses.Second; 
class UsingPackage
{
	public static void main(String args[])
	{
		First f=new First();
		f.displayFirst();
		Second s=new Second();
		s.displaySecond();
	
	
	}

}