class CWP extends Thread{
	String print;
	CWP(String s){
		print=s;
	}
	public void run(){
		System.out.println(print);
		try{
		Thread.sleep(5000);
	}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
public class ChefWaitPerson{
	public static void main (String args []){
		while(true){
		CWP t1=new CWP("Chef preparing Person waiting");
		CWP t2=new CWP("Person eating");
		CWP t3=new CWP("Person finished eating waiting for next order");
		t1.start();
		try{
			t1.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
		t2.start();
		try{
			t2.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		t3.start();
	}
	}
	
}

