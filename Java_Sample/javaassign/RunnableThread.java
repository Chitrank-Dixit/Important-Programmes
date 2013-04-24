/* 90 WAP in java to create a thread using Runnable interface. */
class RunnableThread implements Runnable
{
	public void run()
	{
		System.out.println("Hello Runnable Thread made");
	}
	public static void main(String args[])
	{
		RunnableThread rt=new RunnableThread();
		Thread th=new Thread(rt);
		
		th.start();
	
	}


}