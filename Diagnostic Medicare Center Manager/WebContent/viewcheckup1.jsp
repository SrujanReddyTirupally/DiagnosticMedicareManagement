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
%>
<%

	Connection con=DbConn.getConn();
	PreparedStatement pst=con.prepareStatement("select * from testhistory where reportid=?");
	pst.setString(1,reportid);
	ResultSet rs=pst.executeQuery();
	rs.next();
%>
<form action="viewcheckup2.jsp" >
<table width = 25% >
<input type=hidden name=reportid value="<%= reportid%>"> <br>
<tr><td style = "color:#FFFC00;font-size:150%">customerid:</td><td><input type=text name="customerid" value=<%= rs.getString(2)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">doctorid:</td><td><input type=text name="doctorid" value=<%= rs.getString(3)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">medicareserviceid:</td><td><input type=text name="medicareserviceid" value=<%= rs.getString(4)%>></td></tr><br>
<%-- <tr><td style = "color:#FFFC00;font-size:150%">agentid:</td><td><input type=text name="agentid" value=<%= rs.getString(5)%>></td></tr><br>--%>
<tr><td style = "color:#FFFC00;font-size:150%">servicedate:</td><td><input type=text name="servicedate" value=<%= rs.getString(6)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">testresultdate:</td><td><input type=text name="testresultdate" value=<%= rs.getString(7)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag1value:</td><td><input type=text name="diag1value" value=<%= rs.getString(8)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag1range:</td><td><input type=text name="diag1range" value=<%= rs.getString(9)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag2value:</td><td><input type=text name="diag2value" value=<%= rs.getString(10)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag2range:</td><td><input type=text name="diag2range" value=<%= rs.getString(11)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag3value:</td><td><input type=text name="diag3value" value=<%= rs.getString(12)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag3range:</td><td><input type=text name="diag3range" value=<%= rs.getString(13)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag4value:</td><td><input type=text name="diag4value" value=<%= rs.getString(14)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag4range:</td><td><input type=text name="diag4range" value=<%= rs.getString(15)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag5value:</td><td><input type=text name="diag5value" value=<%= rs.getString(16)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag5range:</td><td><input type=text name="diag5range" value=<%= rs.getString(17)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag6value:</td><td><input type=text name="diag6value" value=<%= rs.getString(18)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">diag6range:</td><td><input type=text name="diag6range" value=<%= rs.getString(19)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">doctorcomments:</td><td><input type=text name="doctorcomments" value=<%= rs.getString(20)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">otherinfo:</td><td><input type=text name="otherinfo" value=<%= rs.getString(21)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%"><input type=submit value="update"></td></tr>
</table>
</form>
</body>
</html>