<jsp:useBean id="convert" class="convert.milestokm" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<p>you entered the digit:
</p>
<%int n=convert.getnum();
out.println(n);
double ans=(n*1.609);
out.println("After conversion: "+ans);
%>
</body>
</html>