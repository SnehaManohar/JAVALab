import java.sql.*;
import java.io.*;
import java.util.Scanner;
public class b1 {
public static void main(String args[]) throws Exception
{
Connection conn=null;
String url="jdbc:mysql://localhost:3306/";
String dbname="mydb";
String username="root";
String password="12345";
String driver="com.mysql.jdbc.Driver";
Class.forName(driver).newInstance();
conn=DriverManager.getConnection(url+dbname,username,password);
String did,dname,dyear,dhead,dnum;
int n=0;
PreparedStatement ps=conn.prepareStatement("insert into department values(?,?,?,?,?)");
Statement stmt=conn.createStatement();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Scanner in=new Scanner(System.in);
System.out.println("Enter how many data you want to insert");
n=in.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("Enter dept_id of the department\n");
did=br.readLine();
System.out.println("Enter name of the department\n");
dname=br.readLine();
System.out.println("Enter the year establishment\n");dyear=br.readLine();
System.out.println("Enter head name of the department\n");
dhead=br.readLine();
System.out.println("enter the number of employees in department\n");
dnum=br.readLine();
ps.setString(1,did);
ps.setString(2,dname);
ps.setString(3,dyear);
ps.setString(4,dhead);
ps.setString(5,dnum);
int j=ps.executeUpdate();
System.out.println(j+"Record updated");
}
String s1="SELECT head_name from department where department_id='202'";
ResultSet rs=stmt.executeQuery(s1);
while(rs.next())
{
dhead=rs.getString(1);
System.out.println(rs.getRow()+"---"+dhead+"---");
}
String s2="SELECT name,department_id from department where year_established>'2010'";
ResultSet rs1=stmt.executeQuery(s2);
while(rs1.next())
{
did=rs1.getString(1);
dname=rs1.getString(2);
System.out.println(rs1.getRow()+"---"+did+"---"+dname);
}
conn.close();
}
}