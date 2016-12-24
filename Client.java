import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
public static void main(String [] args) throws IOException{
int num,temp;
Scanner scan=new Scanner(System.in);
Socket s=new Socket("localhost",1343);
Scanner scan1= new Scanner(s.getInputStream());
System.out.println("Enter a number");
num=scan.nextInt();
PrintStream p=new PrintStream(s.getOutputStream());
p.println(num);
temp=scan1.nextInt();
System.out.println(temp);
}
}