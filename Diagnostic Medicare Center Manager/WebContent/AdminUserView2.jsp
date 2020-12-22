<%@ page language="java" import="java.sql.*,com.cts.DbConn" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image:url('https://expatfinancial.com/wp-content/uploads/2013/07/globalhealthcare.jpg')">
<%
String userid=request.getParameter("userid");
System.out.println(userid);
%>
<%
	Connection con=DbConn.getConn();
	PreparedStatement pst=con.prepareStatement("delete from customer where userid=?");
	pst.setString(1,userid);
	pst.executeUpdate();
%>
<h1> Deleted successfully</h1>

</body>
</html>