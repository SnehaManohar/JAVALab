package package2;
import package1.fourwheeler;
import package1.vehicle;
public class main {
	public  static void main(String args[]){
		try{
		fourwheeler.printf();
		}
		catch (Exception e){
			System.out.println("this is public function");
		}
		try{
			fourwheeler.print();
			}
			catch (Exception e){
				System.out.println("this is without function");
			}
		try{
			vehicle.printv();
			}
			catch (Exception e){
				System.out.println("this is private function");
			}
		try{
			mytwowheeler.printm();
			}
			catch (Exception e){
				System.out.println("this is protected function");
			}
		try{
			fourwheeler.printf();
			}
			catch (Exception e){
				System.out.println("this is public function");
			}
		}

}

