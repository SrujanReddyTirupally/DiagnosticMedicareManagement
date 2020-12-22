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
	PreparedStatement pst=con.prepareStatement("select * from doctor where medicareserviceid=?");
	pst.setString(1,medicareserviceid);
	ResultSet rs=pst.executeQuery();
	rs.next();
	String doctorid=rs.getString(1);
%>
<form action="adminhome.jsp" >
<table width = 25% >
<tr><td style = "color:#FFFC00;font-size:150%">doctorid:</td><td><input type=text name="doctorid" value=<%= rs.getString(1)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">firstname:</td><td><input type=text name="firstname" value=<%= rs.getString(2)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">lastname:</td><td><input type=text name="lastname" value=<%= rs.getString(3)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">age:</td><td><input type=text name="age" value=<%= rs.getString(4)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">gender:</td><td><input type=text name="gender" value=<%= rs.getString(5)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">dob:</td><td><input type=text name="dob" value=<%= rs.getString(6)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">contactnumber:</td><td><input type=text name="contactnumber" value=<%= rs.getString(7)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">altcontactnumber:</td><td><input type=text name="altcontactnumber" value=<%= rs.getString(8)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">emailid:</td><td><input type=text name="emailid" value=<%= rs.getString(9)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">addressline1:</td><td><input type=text name="addressline1" value=<%= rs.getString(11)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">addressline2:</td><td><input type=text name="addressline2" value=<%= rs.getString(12)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">city:</td><td><input type=text name="city" value=<%= rs.getString(13)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">state:</td><td><input type=text name="state" value=<%= rs.getString(14)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">zipcode:</td><td><input type=text name="zipcode" value=<%= rs.getString(15)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">degree:</td><td><input type=text name="degree" value=<%= rs.getString(16)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">specialty:</td><td><input type=text name="specialty" value=<%= rs.getString(17)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">workhours:</td><td><input type=text name="workhours" value=<%= rs.getString(18)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">hospitalname:</td><td><input type=text name="hospitalname" value=<%= rs.getString(19)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">medicareserviceid:</td><td><input type=text name="medicareserviceid" value=<%= rs.getString(20)%>></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%"><input type=submit value="ok"></td></tr>
</table>
</form>
</body>
</html>