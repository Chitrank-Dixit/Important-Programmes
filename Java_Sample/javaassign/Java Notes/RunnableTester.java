		// Fig. 23.5: RunnableTester.java
		// Multiple threads printing at different intervals.
		import java.util.concurrent.Executors;
		import java.util.concurrent.ExecutorService;
		
		public class RunnableTester
		{
		   public static void main( String[] args )
		   {
		      // create and name each runnable             
		      PrintTask task1 = new PrintTask( "thread1" );
		      PrintTask task2 = new PrintTask( "thread2" );
		      PrintTask task3 = new PrintTask( "thread3" );
		        
		      System.out.println( "Starting threads" );
		        
		      // create ExecutorService to manage threads                        
		      ExecutorService threadExecutor = Executors.newFixedThreadPool( 3 );
		
		      // start threads and place in runnable state   
		      threadExecutor.execute( task1 ); // start task1
		      threadExecutor.execute( task2 ); // start task2
		      threadExecutor.execute( task3 ); // start task3
		
		      threadExecutor.shutdown(); // shutdown worker threads
		   
        		      System.out.println( "Threads started, main ends\n" );
	   } // end main
		} // end class RunnableTester


