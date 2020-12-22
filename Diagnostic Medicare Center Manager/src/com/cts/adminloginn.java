package com.cts;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminloginn")
public class adminloginn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		 response.setContentType("text/html");		
			String id = request.getParameter("admin_id");
			String password = request.getParameter("admin_Password");
			//System.out.println("="+id+""+password);
			
					
			try 
			{	
				Connection con = DbConn.getConn();
				PreparedStatement pst = con.prepareStatement("select * from admin where adminid=? and password=?");
				pst.setString(1, id);
				pst.setString(2, password);
			   ResultSet rs=pst.executeQuery();
			   
				boolean result=rs.next();
				if(result){
					System.out.println("------------"+rs.getString("adminid")+""+rs.getString("password"));
					response.sendRedirect("adminhome.jsp");
						return;
				}			
				response.sendRedirect("adminlogin.jsp");
				return;
		
			} catch (Exception e) {
				e.printStackTrace();
			}				
		
		
	}

}
