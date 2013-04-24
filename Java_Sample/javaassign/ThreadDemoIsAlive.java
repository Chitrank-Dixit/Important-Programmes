/* 91 WAP in java to determine whether a thread is alive or not. */
class MyThread extends Thread
{
	String msg;
	MyThread(String s)
	{
		super(s);
		msg=s;
		
		this.start();
	
	}
	public void run()
	{
		System.out.println("Thread....."+msg+"....start");
		for(int i=0;i<=10;i++)
			
			System.out.println("Thread...."+msg+"......"+i);
		System.out.println("Thread....."+msg+"...finished");
	
	}
	



}
class ThreadDemoIsAlive
{
	public static void main(String args[])
	{
		MyThread ob1=new MyThread("First");
		MyThread ob2=new MyThread("Second");
		
		ob1.setPriority(1);
		ob2.setPriority(2);
		
		System.out.println("Thread...."+ob1.msg+"..."+ob1.isAlive());
		System.out.println("Thread...."+ob2.msg+"..."+ob2.isAlive());
		
		try {
		ob1.join();
		
		ob2.join();
		
		
		
		
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
			
		
		}
		System.out.println("Thread...."+ob1.msg+"..."+ob1.isAlive());
		System.out.println("Thread...."+ob2.msg+"..."+ob2.isAlive());
		
	
	
	
	}



}