public class fivethreads {
public static void main(String args[]) throws InterruptedException{
Thread T1=new Thread();
Thread T2=new Thread();
Thread T3=new Thread();
Thread T4=new Thread();
Thread T5=new Thread();
T1.setPriority(1);
T2.setPriority(3);
T3.setPriority(5);
T5.setPriority(Thread.MAX_PRIORITY);
T4.setPriority(Thread.MAX_PRIORITY);
T5.setPriority(Thread.MAX_PRIORITY);T1.start();
if (T1.isAlive())
System.out.println("Thread 1 is alive");
else
System.out.println("Thread 1 is not alive");
T2.start();
if (T2.isAlive())
System.out.println("Thread 2 is alive");
else
System.out.println("Thread 2 is not alive");
T3.start();
if (T3.isAlive())
System.out.println("Thread 3 is alive");
else
System.out.println("Thread 3 is not alive");
T4.sleep(1000);
if (T4.isAlive())
System.out.println("Thread 4 is alive");
else
System.out.println("Thread 4 is not alive");
T5.sleep(1000);
if (T5.isAlive())
System.out.println("Thread 5 is alive");
else
System.out.println("Thread 5 is not alive");
}

}