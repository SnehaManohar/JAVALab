<%
   // Create cookies for first and last names.      
   Cookie e = new Cookie("EMPID",
 			  request.getParameter("EMPID"));
   
   e.setMaxAge(60*60*24); 


   // Add both the cookies in the response header.
   response.addCookie( e );

%>
<html>
<head>
<title>Setting Cookies</title>
</head>
<body>
<center>
<h1>Setting Cookies</h1>
</center>
<ul>
<li><p><b>EMPID:</b>
   <%= request.getParameter("EMPID")%>
<a href=last10b.jsp>continue</a>
</p></li>
</ul>
</body>
</html>