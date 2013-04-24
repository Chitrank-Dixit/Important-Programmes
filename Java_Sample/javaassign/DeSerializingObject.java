/* WAP to deserialize an Object*/
import java.io.*;
class DeSerializingObject
{
  public static void main(String[] args) throws IOException
  {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter File name : ");
    String file = in.readLine();
    System.out.print("Enter extention : ");
    String ext = in.readLine();
	String filename = file+"."+ext;
	File f = new File(filename);
	try{
		ObjectInputStream obj = new ObjectInputStream(new FileInputStream(f));
		System.out.println("The text : "+obj.readObject());
		
		obj.close();
		System.out.println("Deserializing Operation Completly Successfully.");
 
	}
 
	catch(ClassNotFoundException e)
	{
		System.out.println(e.getMessage());
    }
 
	catch(FileNotFoundException fe)
	{
	  System.out.println("File not found ");
 
	}
	System.out.println("Deserialized File");
     System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("SSN: " + e.SSN);
        System.out.println("Number: " + e.number);
 }
  
}