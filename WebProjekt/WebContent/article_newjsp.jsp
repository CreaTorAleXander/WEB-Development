<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="_header.jsp" %>

neuen Artikel hinzufügen

<%@ include file="_menu.html" %>

<form method ="post" action ="article_new_exec.jsp"><pre>
Beschreibung <input size=60 type="text" name="frmBeschr" value=""></br>
EK			 <input size=10 type="text" name="frmEK" value="">&euro;</br>
VK			 <input size=10 type="text" name="frmVK" value="">&euro;</br>
Bestand		 <input size=10 type="text" name="frmBestand" value="">Stück</br>
			 <input type="submit" name="submit" value=" ... Anlegen ...   ">
</pre>
</form>
<form method="post" action="artikel_list.jsp"><pre>
	<input type="submit" name="submit" value= "..... Abbrechen .... "></input>
</pre>
</form>
<%@ include file="_footer.jsp" %>