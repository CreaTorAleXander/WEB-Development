<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hallo Welt</title>
</head>
<body>
<p>Hallo Benutzer, heute ist der
<%
Date d = new Date();
System.out.println("Neuer Zugriff am" +d);
out.print(d + ".");


%>
</p>

</body>
</html>