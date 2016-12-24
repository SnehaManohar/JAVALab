<jsp:useBean id="user" class="user.userdata" scope="session"/>
<jsp:setProperty name="user" property="*"/>
//* because we're using the same name values
<HTML>
<BODY>
<%
user.setUsername(request.getParameter("username"));
user.setEmail(request.getParameter("email"));
user.setdept(request.getParameter("dept"));
%>
<a href="nextpage.jsp">Continue</a>
</BODY>
</HTML>