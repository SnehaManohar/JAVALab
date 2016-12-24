import java.util.Scanner;
interface Students
{
void getvalue(); 
}
interface Department{
void getattendence();
}
public class Exam implements Students,Department {
Scanner input=new Scanner(System.in);
String sno;
String sname;
String cls;
double attended;
double attendence;
double totalcls=100.0;
public void getvalue()
{
System.out.println("---HELLO STUDENT---\n ---ENTER YOUR DETAILS---\n");
System.out.println("\nEnter the usn of student\n");
sno =input.next();
System.out.println("\nEnter the name of the student\n");
sname=input.next();
}
public void getattendence() {
System.out.println("Enter the class for which to check eligibility\n");
cls=input.next();
System.out.println("\nEnter total number of class attended\n");
attended=input.nextDouble();
}
public void calcattendence()
{
System.out.println("\ntotal cls is: "+totalcls);
System.out.println("\ntotal class attended= "+attended);
attendence=((attended/totalcls)*100.0);
System.out.println("\nYour Attendence is: "+attendence);
}
public boolean eligible(){
if(attendence>=75.0)
{
return true;
}
else
{
return false;
}
}
public static void main(String args[])
{
Exam obj=new Exam();
obj.getvalue();
obj.getattendence();
obj.calcattendence();
if(obj.eligible()==true)
{
System.out.println("\nCongratulations!! you can write the exam!\n");
}
else
{
System.out.println("\nYou cannot write the exam!!");
}
}
}