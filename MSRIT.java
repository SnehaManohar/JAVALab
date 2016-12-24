class Mythread extends Thread{
	String a="MSRIT,BANGALORE";
	public void run(){
		try{
		System.out.println(a);
		Thread.sleep(10000);
	}
		catch (InterruptedException e)
		{
			e.printStackTrace();
			}
}
}
class Mythread1 extends Thread{
		String a="KARNATAKA";
		public void run(){
			try{
			System.out.println(a);
			
			Thread.sleep(5000);
		}
			catch (InterruptedException e)
			{
				e.printStackTrace();
				}
	}
}
public class MSRIT {
	public static void main (String args[]){
	while(true){
		Mythread t1=new Mythread();
		Mythread1 t2=new Mythread1();
		t1.start();
	
		t2.start();
		
			
		}

	}
	}



