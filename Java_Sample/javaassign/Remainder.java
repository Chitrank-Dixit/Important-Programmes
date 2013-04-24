/* WAP in java using thread to create Reminder */
import java.util.Timer;
import java.util.TimerTask;

/**
 * Simple demo that uses java.util.Timer to schedule a task 
 * to execute once 5 seconds have passed.
 */

public class Remainder {
    Timer timer;

    public Remainder(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
	}

    class RemindTask extends TimerTask {
        public void run() {
            System.out.format("Time's up!%n");
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) {
        new Remainder(5);
        System.out.format("Task scheduled.%n");
    }
}