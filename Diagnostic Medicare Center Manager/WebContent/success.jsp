<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <body style="background-image:url('https://expatfinancial.com/wp-content/uploads/2013/07/globalhealthcare.jpg')">    
<h1 style = "color:#FFFC00;font-size:300%"> Registration success</h1>
<%
out.println(session.getAttribute("uname"));
out.println("PLEASE NOTE YOUR ID TO LOGIN LATER");
out.println(session.getAttribute("uid"));
%>
</body>