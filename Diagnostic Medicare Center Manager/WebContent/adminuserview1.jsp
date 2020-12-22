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
	PreparedStatement pst=con.prepareStatement("select * from customer where userid=?");
	pst.setString(1,userid);
	ResultSet rs=pst.executeQuery();
	rs.next();
%>
<form action="adminhome.jsp" >
<table width = 25% >
<tr><td style = "color:#FFFC00;font-size:150%">firstname:</td><td><input type=text name="firstname" value=<%= rs.getString(1)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">lastname:</td><td><input type=text name="lastname" value=<%= rs.getString(2)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">age:</td><td><input type=text name="age" value=<%= rs.getString(3)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">gender:</td><td><input type=text name="gender" value=<%= rs.getString(4)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">dob:</td><td><input type=text name="dob" value=<%= rs.getString(5)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">contact:</td><td><input type=text name="contact" value=<%= rs.getString(6)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">altcontact:</td><td><input type=text name="altcontact" value=<%= rs.getString(7)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">email:</td><td><input type=text name="email" value=<%= rs.getString(8)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">address1:</td><td><input type=text name="address1" value=<%= rs.getString(10)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">address2:</td><td><input type=text name="address2" value=<%= rs.getString(11)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">city:</td><td><input type=text name="city" value=<%= rs.getString(12)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">state:</td><td><input type=text name="state" value=<%= rs.getString(13)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">zipcode:</td><td><input type=text name="zipcode" value=<%= rs.getString(14)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%"><input type=submit value="ok"></td></tr>
</table>
</form>
</body>
</html>


