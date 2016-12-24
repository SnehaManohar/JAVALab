<jsp:useBean id="convert" class="convert.milestokm" scope="session"/>
<jsp:setProperty name="convert" property="*"/>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
try
{
convert.setnum(Integer.parseInt(request.getParameter("num")));
//out.println("<a href='converttokm.jsp'>Continue</a>");
}
catch(Exception e)
{
out.println("invalid data\n");
}
%>
<a href='converttokm.jsp'>Continue</a>
</body>
</html>