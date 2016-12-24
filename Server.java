import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class Server {
public static void main(String [] args) throws IOException{
int num,temp;
ServerSocket s1=new ServerSocket(1343);
System.out.println("Server Connected! Listening to client!\n");
Socket ss=s1.accept();
Scanner scan=new Scanner(ss.getInputStream());
num=scan.nextInt();
temp=num*2;
PrintStream p=new PrintStream(ss.getOutputStream());
p.println(temp);
}
}