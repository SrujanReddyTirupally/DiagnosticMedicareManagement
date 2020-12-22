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
String medicareserviceid=request.getParameter("medicareserviceid");
%>
<%

	Connection con=DbConn.getConn();
	PreparedStatement pst=con.prepareStatement("select * from medicareservices where medicareserviceid=?");
	pst.setString(1,medicareserviceid);
	ResultSet rs=pst.executeQuery();
	rs.next();
%>

<form action="adminviewmed2.jsp" >
<table width = 25% >
<tr><td><input type=hidden name=medicareserviceid value="<%= medicareserviceid%>"></td></tr> <br>
<tr><td style = "color:#FFFC00;font-size:150%">Medicare Service:</td><td><input type=text name="medicareservice" value=<%= rs.getString(2)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">Service Description:</td><td><input type=text name="servicedescription" value=<%= rs.getString(3)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">Amount:</td><td><input type=text name="amount" value=<%= rs.getString(4)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%"><input type=submit value="view doctor"></td></tr>
</table>
</form>
</body>
</html>

