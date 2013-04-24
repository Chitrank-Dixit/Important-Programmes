/* 60 Write a program to change the priority of thread. */
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
class ThreadPriority
{
	public static void main(String args[])
	{
		MyThread ob1=new MyThread("First");
		MyThread ob2=new MyThread("Second");
		MyThread ob3=new MyThread("Third");
		ob1.setPriority(1);
		ob2.setPriority(2);
		ob3.setPriority(3);
		System.out.println("Thread...."+ob1.msg+"..."+ob1.isAlive());
		System.out.println("Thread...."+ob2.msg+"..."+ob2.isAlive());
		System.out.println("Thread...."+ob3.msg+"..."+ob3.isAlive());
		try {
		ob1.join();
		
		ob2.join();
		
		ob3.join();
		
		
		}
		catch(Exception e)
		{
			System.out.println("Error: "+e);
			
		
		}
		System.out.println("Thread...."+ob1.msg+"..."+ob1.isAlive());
		System.out.println("Thread...."+ob2.msg+"..."+ob2.isAlive());
		System.out.println("Thread...."+ob3.msg+"..."+ob3.isAlive());
	
	
	
	}



}