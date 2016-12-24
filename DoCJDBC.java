import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;
public class DoCJDBC {
	public static void main(String args[]) throws Exception{
		Connection conn=null;
		//try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			String did,name,gender,special,fee,address;
			int n=0;
			PreparedStatement ps=conn.prepareStatement("insert into DOC values(?,?,?,?,?,?)");
			Statement stmt=conn.createStatement();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner in=new Scanner(System.in);
			System.out.println("Enter how many data you want to insert");
			n=in.nextInt();
			
			for(int i=0;i<n;i++)
			{
			System.out.println("Enter doctor id\n");
			did=br.readLine();
			System.out.println("Enter doctor's name\n");
			name=br.readLine();
			System.out.println("Enter the doctor's gender\n");
			gender=br.readLine();
			System.out.println("Enter doctor's specialization\n");
			special=br.readLine();
			System.out.println("enter doctor's fee\n");
			fee=br.readLine();
			System.out.println("enter doctor's address\n");
			address=br.readLine();
			ps.setString(1,did);
			ps.setString(2,name);
			ps.setString(3,gender);
			ps.setString(4,special);
			ps.setString(5,fee);
			ps.setString(6,address);
			int j=ps.executeUpdate();
			System.out.println(j+"Record updated");
			}
			String q1="select id,name from DOC where gender='M' and special='Child Specialit'";
			ResultSet rs=stmt.executeQuery(q1);
			while(rs.next())
			{
				String f=rs.getString(1);
				System.out.println("male child specialist");
				System.out.println("Doctor_id :"+f);
				String f1=rs.getString(2);
				System.out.println("Name :"+f1);
			}
			System.out.println();
			String q2="select name,fee from DOC where gender='F' and special='Gynecologist'";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(q2);
			while(rs.next())
			{
				String f=rs.getString(1);
				System.out.println("female gynecologist");
				System.out.println("Name :"+f);
				String f1=rs.getString(2);
				System.out.println("Fees :"+f1);
			}
		}
		
	}
	
}
