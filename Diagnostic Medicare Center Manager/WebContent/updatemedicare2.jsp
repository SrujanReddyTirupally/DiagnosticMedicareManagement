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
String medicareservice=request.getParameter("medicareservice");
String servicedescription=request.getParameter("servicedescription");
String amount=request.getParameter("amount");
out.println(medicareserviceid+"  "+medicareservice+"  "+servicedescription+"  "+amount);
	Connection con=DbConn.getConn();
	PreparedStatement pst=con.prepareStatement("update medicareservices set medicareservice=?,servicedescription=?,amount=? where medicareserviceid=?");
	pst.setString(1,medicareservice);
	pst.setString(2,servicedescription);
	pst.setString(3,amount);
	pst.setString(4,medicareserviceid);
	out.println(pst.executeUpdate());
	out.println("Updated successfully");
	
%>
</body>
</html>