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
String reportid=request.getParameter("reportid");
String customerid=request.getParameter("customerid");
String doctorid=request.getParameter("doctorid");
String medicareserviceid=request.getParameter("medicareserviceid");
String agentid=request.getParameter("agentid");
String servicedate=request.getParameter("servicedate");
String testresultdate=request.getParameter("testresultdate");
String diag1value=request.getParameter("diag1value");
String diag1range=request.getParameter("diag1range");
String diag2value=request.getParameter("diag2value");
String diag2range=request.getParameter("diag2range");
String diag3value=request.getParameter("diag3value");
String diag3range=request.getParameter("diag3range");
String diag4value=request.getParameter("diag4value");
String diag4range=request.getParameter("diag4range");
String diag5value=request.getParameter("diag5value");
String diag5range=request.getParameter("diag5range");
String diag6value=request.getParameter("diag6value");
String diag6range=request.getParameter("diag6range");
String doctorcomments=request.getParameter("doctorcomments");
String otherinfo=request.getParameter("otherinfo");

Connection con=DbConn.getConn();
PreparedStatement pst=con.prepareStatement("update testhistory set customerid=?,doctorid=?,medicareserviceid=?,agentid=?,servicedate=?,testresultdate=?,diag1value=?,diag1range=?,diag2value=?,diag2range=?,diag3value=?,diag3range=?,diag4value=?,diag4range=?,diag5value=?,diag5range=?,diag6value=?,diag6range=?,doctorcomments=?,otherinfo=? where reportid=?");
pst.setString(1,customerid);
pst.setString(2,doctorid);
pst.setString(3,medicareserviceid);
pst.setString(4,agentid);
pst.setString(5,servicedate);
pst.setString(6,testresultdate);
pst.setString(7,diag1value);
pst.setString(8,diag1range);
pst.setString(9,diag2value);
pst.setString(10,diag2range);
pst.setString(11,diag3value);
pst.setString(12,diag3range);
pst.setString(13,diag4value);
pst.setString(14,diag4range);
pst.setString(15,diag5value);
pst.setString(16,diag5range);
pst.setString(17,diag6value);
pst.setString(18,diag6range);
pst.setString(19,doctorcomments);
pst.setString(20,otherinfo);
pst.setString(21,reportid);
out.println(pst.executeUpdate());
out.println("Updated successfully");
%>
</body>
</html>