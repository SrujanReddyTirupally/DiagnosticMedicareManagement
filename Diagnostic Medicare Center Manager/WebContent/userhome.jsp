<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image:url('https://expatfinancial.com/wp-content/uploads/2013/07/globalhealthcare.jpg')"> 
<h2 align=center style = "color:#FFFC00;font-size:150%">welcome</h2>
<form action="userviewreq.jsp" method="post">
<table align = center>
<tr><td align = center> <input type="button" style = "width:150px;height:40px;"value="view medicare" onclick="window.location.href='http://localhost:8080/Diagnostic_Medicare_Center_Manager/viewmedicare.jsp'"/></td></tr> 
<br>
<%-- <tr><td align = center> <input type="button" style = "width:150px;height:40px;"value="view agent" onclick="window.location.href='http://localhost:8080/Diagnostic_Medicare_Center_Manager/AdminViewAgent.jsp'"/></td></tr> --%>
<br>
<tr><td align = center> <input type=submit style = "width:150px;height:40px;"value="view requests"></td></tr> 
</table>
<a href="logout.jsp"> Logout</a>
</form>
</body>
</html>

