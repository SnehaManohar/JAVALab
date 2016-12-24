import java.util.Scanner;
class movieMagic
{

int year;
String title;
float rating;
movieMagic(){
	year=0;
	title="";
	rating=0;
}
void accept()
{
Scanner in=new Scanner(System.in);
System.out.println("Enter year :");
year=in.nextInt();
System.out.println("Enter title :");
in.nextLine();
title=in.nextLine();
System.out.println("Enter rating :");
rating=in.nextFloat();
}
void display()
{
System.out.println("movie is: "+title);
if(rating<2.0)
System.out.println("--FLOP--");
else if(rating<3.4)
System.out.println("--SEMI-HIT--");
else if(rating<4.5)
System.out.println("--HIT--");
else
System.out.println("--SUPER-HIT--");
}
}
public class mainmovie {
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter no of movies");
int n=in.nextInt();
for(int i=0;i<n;i++)
{
movieMagic m=new movieMagic();
m.accept();
m.display();
}
}
}