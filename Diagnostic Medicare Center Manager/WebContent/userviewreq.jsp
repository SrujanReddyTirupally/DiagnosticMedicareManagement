<%@ page language="java" import="java.sql.*,com.cts.DbConn" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image:url('https://expatfinancial.com/wp-content/uploads/2013/07/globalhealthcare.jpg')">
<form action="userviewreq1.jsp" method="post">
<%
String customerid=(String)session.getAttribute("usid");
System.out.println(customerid);
%>
<%
	Connection con=DbConn.getConn();
	PreparedStatement pst=con.prepareStatement("select reportid from testhistory where customerid=?");
	pst.setString(1,customerid);
	ResultSet rs=pst.executeQuery();
	out.println("request id's: <select name='reportid'>");
	while(rs.next()) {
		%>
		    <option value=<%= rs.getString(1) %>><%= rs.getString(1) %></option>

		<%}%>
		</select>
		<input type=submit value="view">

</body>
</html>