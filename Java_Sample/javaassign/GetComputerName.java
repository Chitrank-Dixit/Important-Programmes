/*WAP in java to get machine user name. */
import java.util.*;
import java.lang.*;
import java.net.*;

class GetComputerName
{
  public static void main(String args[])
  {
  try
  {
  String computername=InetAddress.getLocalHost().getHostName();
  System.out.println(computername);
  }
  catch (Exception e)
  {
  System.out.println("Exception caught ="+e.getMessage());
  }
  }
}