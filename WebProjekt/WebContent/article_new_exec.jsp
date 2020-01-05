<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="meinShop.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<%@ include file="_header.jsp" %>
neuer Artikel

<%@ include file="_menu.html" %>
<%

try{
	String beschr = request.getParameter("frmBeschr");
	double ek = new Double(request.getParameter("frmEK"));
	double vk = new Double(request.getParameter("frmVK"));
	int bestand = new Integer(request.getParameter("frmBestand"));
	
	ArtikelverwaltungsBean.articles.add(new Article(beschr, ek, vk, bestand));
	
	
	out.println("<script language='JavaScript'>window.location='artikel_list.jsp'</script>");
}catch(Exception e){
	out.println("<h2>Beim editieren ist ein Fehler aufgetreten</h2>");
}
	




%>

<%@ include file="_footer.jsp" %>




</body>
</html>