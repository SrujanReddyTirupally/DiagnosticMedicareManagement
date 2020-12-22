<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image:url('https://expatfinancial.com/wp-content/uploads/2013/07/globalhealthcare.jpg')"> 
<%
String doctorid=request.getParameter("doctorid");
%>
<form action="testreg" method="post">
<table align=center >
<tr>
	<td style = "color:#FFFC00;font-size:150%">customerid:</td>
	<td> <input type="number" name="customerid"></td>
  	</tr>
	<br>
	
	<%-- <tr>
	<td style = "color:#FFFC00;font-size:150%">agentid:</td>
	<td> <input type="date" name="agentid"></td>
  	</tr>
	<br>
	<tr>
	--%>
	<td style = "color:#FFFC00;font-size:150%">servicedate:</td>
	<td> <input type="date" name="servicedate"></td>
  	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">testresultdate:</td>
	<td> <input type="date" name="testresultdate"></td>
  	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">diag1-actual value:</td>
	<td> <input type="number"  name="diag1value"  maxlength="10" > </td>
	</tr>
	<br>
    <tr>
	<td style = "color:#FFFC00;font-size:150%">diag1-normal range:</td>
	<td> <input type="number"  name="diag1range"  maxlength="10"> </td>
	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">diag2-actual value:</td>
	<td> <input type="number"  name="diag2value"  maxlength="10" > </td>
	</tr>
	<br>
    <tr>
	<td style = "color:#FFFC00;font-size:150%">diag2-normal range:</td>
	<td> <input type="number"  name="diag2range"  maxlength="10"> </td>
	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">diag3-actual value:</td>
	<td> <input type="number"  name="diag3value"  maxlength="10" > </td>
	</tr>
	<br>
    <tr>
	<td style = "color:#FFFC00;font-size:150%">diag3-normal range:</td>
	<td> <input type="number"  name="diag3range"  maxlength="10"> </td>
	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">diag4-actual value:</td>
	<td> <input type="number"  name="diag4value"  maxlength="10" > </td>
	</tr>
	<br>
    <tr>
	<td style = "color:#FFFC00;font-size:150%">diag4-normal range:</td>
	<td> <input type="number"  name="diag4range"  maxlength="10"> </td>
	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">diag5-actual value:</td>
	<td> <input type="number"  name="diag5value"  maxlength="10" > </td>
	</tr>
	<br>
    <tr>
	<td style = "color:#FFFC00;font-size:150%">diag5-normal range:</td>
	<td> <input type="number"  name="diag5range"  maxlength="10"> </td>
	</tr>
	<br>
	<tr>
	<td style = "color:#FFFC00;font-size:150%">diag6-actual value:</td>
	<td> <input type="number"  name="diag6value"  maxlength="10" > </td>
	</tr>
	<br>
    <tr>
	<td style = "color:#FFFC00;font-size:150%">diag6-normal range:</td>
	<td> <input type="number"  name="diag6range"  maxlength="10"> </td>
	</tr>
	<br>
    <tr>
	<td style = "color:#FFFC00;font-size:150%">doctor comments:</td><td><input type=text name="doctorcomments" maxlength= "300" ></td>
	</tr>
	<br>
        <tr>
	<td style = "color:#FFFC00;font-size:150%">other info:</td>
	<td><input type=text name="otherinfo" maxlength= "300" ></td>
	</tr>
	<br>  
	<tr>
	<td align=center><input type=submit style = "width:150px;height:40px;"  value="Raise checkup"></td>
        </tr>
</table>
</form>
</body>
</html>