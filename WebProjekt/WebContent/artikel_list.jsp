<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="meinShop.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
table, th, td{
border-style:solid;
border-collapse:collapse;
border-color:black;
}

th{
color:red;
}

</style>
<title>
Artikelliste
<%@ include file="_menu.html" %>

<%
	
	DecimalFormat df2 = new DecimalFormat("#,##0.00");

	if((ArtikelverwaltungsBean.articles == null)||(ArtikelverwaltungsBean.articles.size()==0)){
		out.println("<h2>Keine Artikel vorhanden</h2>");
	}else{
		out.println("<table id=\"importanttable\">");
		out.println("<thead><tr><th>Beschreibung</th> <th>EK</th><th>VK</th><th>Bestand</th></tr></thead><tbody>");
		for(Article e : ArtikelverwaltungsBean.articles){
		out.println("<tr><td>"+e.beschreibung+"</td><td>"+df2.format(e.ek)+"</td><td>"+df2.format(e.vk)+"</td><td>"+e.bestand+"</td>");
		}
		out.println("</tbody></table>");
	}



%>

<%@ include file="_footer.jsp" %>


	 
		 
			
			
	
	
	
	
