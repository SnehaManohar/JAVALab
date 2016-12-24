import java.util.Scanner;
class IllegalISBNException extends Exception
{
IllegalISBNException()
{
System.out.println("Illegal ISBN");
}
}
public class isbn {
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int sum=0;
System.out.println("Enter 10 digit ISBN:");
int isbn=in.nextInt();
String b=String.valueOf(isbn);
try{ if(b.length()!=10)
throw new IllegalISBNException();
else { for(int i=0;i<10;i++)
{ sum+=(i+1)*Integer.parseInt(b.charAt(i)+"");
System.out.println(sum);
}
if(sum%11==0)System.out.println("LEGAL ISBN");
else throw new IllegalISBNException();
}
}
catch(IllegalISBNException e){}
}
}