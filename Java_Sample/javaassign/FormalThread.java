/* 88 WAP in java to create thread that print counting by extending Thread class. */
class FormalThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try 
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
	}
	public static void main(String args[])
	{
		FormalThread ft=new FormalThread();
		Thread th=new Thread(ft);
		th.start();
		
		
	
	}




}