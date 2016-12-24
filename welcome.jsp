<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<% String user=request.getParameter("username");
String pass=request.getParameter("password");
if(user.equals("admin")&&pass.equals("admin"))
out.println("<h1>VALIDATION SUCCESSFUL!\n WELCOME USER!!!</h1>");
else
{
out.println("<h1>USERNAME OR PASSWORD IS INVALID!!</h1>");
}
%>
</body>
</html>