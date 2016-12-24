import java.sql.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*** Servlet implementation class Emp*/
@WebServlet("/Emp")
public class Emp extends HttpServlet {
	private static final long serialVersionUID = 1L;
     /**
     * @see HttpServlet#HttpServlet()
     */
    public Emp() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int id=Integer.parseInt(request.getParameter("empid"));
		String name=request.getParameter("empname");
		String addr=request.getParameter("addr");
		String dob=request.getParameter("d");
		Connection con=null;
		try
		{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			PreparedStatement stmt=con.prepareStatement("insert into employee values(?,?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, addr);
			stmt.setString(4, dob);
			int i=stmt.executeUpdate();
			out.println("Inserted Successfully!!!");
			String q1="select * from employee";
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery(q1);
			out.println("<table border=1 width=50% height=50%>");
	        out.println("<tr><td>EMP ID</td><td>EMP NAME</td><td>ADDRESS</td><td>DOB</td></tr>");
	        String f1,f2,f3,f4;
			while(rs.next())
			{
				f1 = rs.getString(1);
    			f2=rs.getString(2);
    			f3=rs.getString(3);
    			f4=rs.getString(4);
    			out.println("<TR>");
    		  	out.println("  <TD>" + f1 + "</TD>");
    		  	out.println("  <TD>" + f2 + "</TD>");
    		  	out.println("  <TD>" + f3 + "</TD>");
    		  	out.println("  <TD>" + f4 + "</TD>");
    		  	out.println("</TR>");
            }
            out.println("</table>");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
}