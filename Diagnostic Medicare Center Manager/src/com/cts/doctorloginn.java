package com.cts;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/doctorloginn")
public class doctorloginn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response){
		
		 response.setContentType("text/html");		
			String id = request.getParameter("doc_id");
			String password = request.getParameter("doc_Password");			
			
			try 
			{	
				Connection con = DbConn.getConn();
				PreparedStatement pst = con.prepareStatement("select * from doctor where doctorid=? and password=?");
				pst.setString(1, id);
				pst.setString(2, password);
			   ResultSet rs=pst.executeQuery();
			   HttpSession session =request.getSession(true);
				session.setMaxInactiveInterval(10000);
			    session.setAttribute("docid",id);
				boolean result=rs.next();
				if(result){
					System.out.println("------------"+rs.getString("doctorid")+""+rs.getString("password"));
					RequestDispatcher rd=request.getRequestDispatcher("doctorhome.jsp");
					rd.forward(request, response);
					//response.sendRedirect("doctorhome.jsp");
						return;
				}	
				else
				response.sendRedirect("doctorlogin.jsp");
				return;
		
			} catch (Exception e) {
				e.printStackTrace();
			}					
	}
}
