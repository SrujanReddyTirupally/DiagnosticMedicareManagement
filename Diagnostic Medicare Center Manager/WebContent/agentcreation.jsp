<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image:url('https://expatfinancial.com/wp-content/uploads/2013/07/globalhealthcare.jpg')"> 
<form action="agentregistration" method="post">
<table align=center >
	<tr>
	<td style = "color:#FFFC00;font-size:150%">First Name  :(letters only, no punctuation or special characters)</td>	
	<td><input type=text name="First Name" maxlength= "50"  required></td>
	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">Last Name :(letters only, no punctuation or special characters)</td>
	<td><input type=text name="Last Name" maxlength= "50" required></td>
	</tr>	
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">Age :</td>
	<td><input type="number" name="Age" min= "1" max ="110" step = "1" required></td>
	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">Gender :</td><td><select name="Gender"></option><option value = "M"  required>M</option><option value = "F" 	required>F</option></select></td>
	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">DoB :</td>
	<td> <input type="date" name="DoB"></td>
  	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">Contact Number :</td>
	<td> <input type="number"  name="Contact Number"  maxlength="10" > </td>
	</tr>
	<br>
    <tr>
	<td style = "color:#FFFC00;font-size:150%">Alt Contact Number :</td>
	<td> <input type="number"  name="Alt Contact Number"  maxlength="10"> </td>
	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">Email ID :</td>
	<td><input type=email name="Email ID" maxlength= "50"  required></td>
	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">Password :</td><td><input type=password name="Password" maxlength= "15"  required></td>
	</tr>
	<br>
        <tr>
	<td style = "color:#FFFC00;font-size:150%">Address Line 1 :</td><td><input type=text name="Address line 1" maxlength= "100"  required></td>
	</tr>
	<br>
        <tr>
	<td style = "color:#FFFC00;font-size:150%">Address Line 2 :</td>
	<td><input type=text name="Address Line 2" maxlength= "100" required></td>
	</tr>
	<br>
        <tr>
        <td style = "color:#FFFC00;font-size:150%">City :</td>
	<td><input type=text name="City" maxlength= "50" required></td>	
	</tr><br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">State :</td>
	<td><input type=text name="State" maxlength= "50" required></td>
	</tr>
	<br>
	<tr>	
	<td style = "color:#FFFC00;font-size:150%">Zip Code :</td>
	<td><input type="number" name="Zip Code" maxlength="6"
        required></td>
	</tr>
	<br>
	        <tr>
	<td align=center><input type=submit style = "width:150px;height:40px;" value="create"></td>
        </tr>
</table>
</form>
</body>
</html>