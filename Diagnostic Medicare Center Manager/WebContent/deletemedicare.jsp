<%@ page language="java" import="java.sql.*,com.cts.DbConn"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image:url('https://expatfinancial.com/wp-content/uploads/2013/07/globalhealthcare.jpg')">

<form action="deletemedicare1.jsp" method="post">
<%
String doctorid=(String)session.getAttribute("docid");
System.out.println(doctorid);
%>
<%
	Connection con=DbConn.getConn();
	PreparedStatement pst=con.prepareStatement("select medicareserviceid from doctor where doctorid=?");
	pst.setString(1,doctorid);
	ResultSet rs=pst.executeQuery();
	out.println("ID: <select name='medicareserviceid'>");
	while(rs.next()) {
%>
 Select ID to be deleted :   <option value=<%= rs.getString(1) %>><%= rs.getString(1) %></option>

<%}%>
</select>
<input type=submit value="Delete">
</form>
</body>
</html>