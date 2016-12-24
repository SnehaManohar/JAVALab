class Thread1 implements Runnable{
	String s1="MSRIT, Bangalore";
	
	Thread1()
	{
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println(s1);
				Thread.sleep(10000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class Thread2 implements Runnable{
	String s1="KARNATAKA";
	
	Thread2()
	{
		Thread t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				System.out.println(s1);
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class MyThread
{
	public static void main(String args[])
	{
		new Thread1();
		new Thread2();
	}
}