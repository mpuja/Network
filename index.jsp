<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP add </title>
</head>
<body>
<%
int num=Integer.parseInt(request.getParameter("first num"));
int num2=Integer.parseInt(request.getParameter("Second num"));
int result=num+num2;
out.print("ADD "+result);
%>

</body>
</html>