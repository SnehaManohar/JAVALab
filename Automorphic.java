import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Automorphic")
public class Automorphic extends HttpServlet {
private static final long serialVersionUID = 1L;
public Automorphic() {
super();
}
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
response.setContentType("text/html");
int number=Integer.parseInt(request.getParameter("number"));
int sq=number*number;
String num=Integer.toString(number);
String square=Integer.toString(sq);
if(square.endsWith(num))
out.println("IT IS AN AUTOMORPHIC NUMBER");
else
out.println("IT IS NOT AN AUTOMORPHIC NUMBER");
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
}
}