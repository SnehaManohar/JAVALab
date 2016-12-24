import books.info;
import journals.info1;
import java.util.Scanner;
class student{
int choice=0;
int method1()
{System.out.println("HELLO STUDENT!!\n PLEASE ENTER WHICH BOOK YOU WANT TO ISSUE\n");
System.out.println("ENTER 0 FOR HARRY POTTER\n ENTER 1 FOR THE NOTEBOOK\n 2 FOR THE ALCHEMIST\n 3 FOR DAVID COPPERFIELD\n 4 FOR ULYSSES\n");
Scanner in=new Scanner(System.in);
choice=in.nextInt();
return choice;
}
int method2()
{
System.out.println("\nHELLO STUDENT!!\n PLEASE ENTER WHICH JOURNAL YOU WANT TO ISSUE\n");
System.out.println("ENTER 0 FOR IEEE MAGAZINE\n ENTER 1 FOR THE ATLANTIC\n 2 FOR THE ECONOMICS TIMES\n");
Scanner in=new Scanner(System.in);
choice=in.nextInt();
return choice;
}
}
class staff{
int choice=0;
int method1()
{
System.out.println("\nHELLO STAFF MEMBER!!\n PLEASE ENTER WHICH BOOK YOU WANT TO ISSUE\n");
System.out.println("ENTER 0 FOR HARRY POTTER\n ENTER 1 FOR THE NOTEBOOK\n 2 FOR THE ALCHEMIST\n 3 FOR DAVID COPPERFIELD\n 4 FOR ULYSSES\n");
Scanner in=new Scanner(System.in);
choice=in.nextInt();
return choice;
}
int method2()
{
System.out.println("\nHELLO STAFF MEMBER!!\n PLEASE ENTER WHICH JOURNAL YOU WANT TO ISSUE\n");
System.out.println("ENTER 0 FOR IEEE MAGAZINE\n ENTER 1 FOR THE ATLANTIC\n 2 FOR THE ECONOMICS TIMES\n");
Scanner in=new Scanner(System.in);
choice=in.nextInt();
return choice;
}
}
public class show {
public static void main(String args[])
{ Scanner in=new Scanner(System.in);
int n=0;
int n1=0;
int ch=0;
info b=new info();
info1 j=new info1();
student stu=new student();
staff sta=new staff();
System.out.println("----ENTER 1 IF YOU ARE A STAFF OR ENTER 2 IF YOU ARE A STUDENT---\n");
n=in.nextInt();
System.out.println("ENTER 1 IF YOU WANT TO ISSUE A BOOK OR 2 IF YOU WANT TO ISSUE A JOURNAL\n");
n1=in.nextInt();
if(n==1&&n1==1)
{
ch=sta.method1();
b.display(ch);
}else if(n==1&&n1==2)
{
ch=sta.method2();
j.display(ch);
}
if(n==2&&n1==1)
{
ch=stu.method1();
b.display(ch);
}
else if(n==2&&n1==2)
{
ch=stu.method2();
j.display(ch);
}
}
}