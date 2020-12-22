<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body style="background-image:url('https://expatfinancial.com/wp-content/uploads/2013/07/globalhealthcare.jpg')"> 
<h1 align = center style = "color:#FFFC00;font-size:150%">Create Medicare Service</h1>
<form action="medicareregistration" method="post" >
<table align = center>
<tr><td style = "color:#FFFC00;font-size:150%">doctorid:</td><td><input type=text name="doctorid"></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">Medicare Service:</td><td><input type=text name="MedicareService"></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">Service Description:</td><td><input type=text name="ServiceDescription"></td></tr><br>
<tr><td style = "color:#FFFC00;font-size:150%">Amount:</td><td><input type=text name="Amount"></td></tr><br>
</table>
<table align = center>
<tr><td align= center>
<input type=submit value="Register">
</td></tr>
</table>
</form>

<h1 align = center style = "color:#FFFC00;font-size:150%"> Update Medicare</h1>
<form action="updatemedicare.jsp" >
<table align=center>
<tr><td align=center>
<input type=submit value="Update"></td></tr>
</table>

</form>
<h1 align=center style = "color:#FFFC00;font-size:150%"> Delete Medicare</h1>
<form action="deletemedicare.jsp" methods="post">
<table align = center>
<tr><td align=center>
<input type=submit value="delete"></td></tr>
</table>

</form>
<h1 align=center style = "color:#FFFC00;font-size:150%"> View Checkup Requests</h1>
<form action="viewcheckup.jsp" >
<table align = center>
<tr><td align=center>
<input type=submit value="view">
</td></tr>
</table>
<a href="logout.jsp"> Logout</a>
</form>
</body>
</html>