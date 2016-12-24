import java.util.Scanner;
class NameException extends Exception{
NameException()
{
System.out.println("\nERROR!! PLEASE ENTER A PROPER NAME!!\n");
}
}
class AgeException extends Exception{
AgeException()
{
System.out.println("\nERROR!! PLEASE ENTER PROPER AGE!!\n");
}
}
class Emp{
String name;
int age;
Emp(String n,int a)
{
name=n;
age=a;
System.out.println("NEW OBJECT IS CREATED\n");
System.out.println("name: "+name+" age: "+age);
}
}
public class EmpException
{
public static boolean isNum(String name)
{
boolean ret=true;
try{
Double.parseDouble(name);
}
catch(NumberFormatException e)
{
ret=false;
}
return ret;
}
public static void main(String args[]){
String n=null;
int age=0;
Scanner in=new Scanner(System.in);
try
{
System.out.println("Enter the name:");
n=in.next();
if(isNum(n))
throw new NameException();
System.out.println("Enter age:");
age=in.nextInt();
if(age>50)
throw new AgeException();
else
new Emp(n,age);
}
catch(AgeException e){}
catch(NameException e){}
}}