<jsp:useBean id="user" class="user.userdata" scope="session"/>
<HTML>
<BODY>
You entered<BR>
Name: <%= user.getUsername() %><BR>
Email: <%= user.getEmail() %><BR>
Dept: <%= user.getdept() %><BR>
</BODY>
</HTML>