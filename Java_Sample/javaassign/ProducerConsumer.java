/* 61 WAP for producer consumer problem (with synchronization).  */
class Multithreading {
int val;
boolean value = false;
synchronized int get() {
if(!value)
try {
wait();
} catch(Exception e) {
System.out.println(e);
}
System.out.println("Get: " + val);
value = false;
notify();
return val;
}
synchronized void put(int val) {
if(value)
try {
wait();
} catch(Exception e) {
System.out.println(e);
}
this.val = val;
value = true;
System.out.println("Put: " + val);
notify();
}
}

class Producer implements Runnable {
Multithreading th;
Producer(Multithreading th) {
this.th = th;
new Thread(this, "Producer").start();
}
public void run() {
int i = 0;
while(i<=50) {
th.put(i++);
}
}
}

class Consumer implements Runnable {
Multithreading th;
Consumer(Multithreading th) {
this.th = th;
new Thread(this, "Consumer").start();
}
public void run() {
while(true) {
th.get();
}
}
}
class ProducerConsumer {
public static void main(String args[]) {
Multithreading th = new Multithreading();
new Producer(th);
new Consumer(th);
}
}
