<%@ page language="java" import="com.cts.DbConn,java.sql.*" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String id = request.getParameter("user_id");
String password = request.getParameter("user_Password");
Connection con = DbConn.getConn();		
		
	PreparedStatement pst = con.prepareStatement("select * from customer where userid=? and password=?");
	pst.setString(1, id);
	pst.setString(2, password);
	  ResultSet rs=pst.executeQuery();
	    session.setAttribute("usid",id);  
	    System.out.println(id);
		boolean result=rs.next();
	if(result){
		System.out.println("------------"+rs.getString("userid")+""+rs.getString("password"));
		RequestDispatcher rd=request.getRequestDispatcher("userhome.jsp");
		rd.forward(request, response);
	}
	else
		response.sendRedirect("userlogin.jsp");

%>

</body>
</html>