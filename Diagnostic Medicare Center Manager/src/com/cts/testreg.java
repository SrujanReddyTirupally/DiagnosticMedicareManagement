package com.cts;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Random;
import com.cts.DbConn;
import bo.cts.TestregBO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/testreg")
public class testreg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter(); 
		Random ran=new Random();
		int id1=ran.nextInt(100000);
		String reportid=new Integer(id1).toString();
		System.out.println(reportid);
		 try {
			Connection con=DbConn.getConn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 HttpSession session =request.getSession();
		 String medicareserviceid=(String)session.getAttribute("mid");
		 String doctorid=(String)session.getAttribute("did");
		 System.out.println(medicareserviceid); 
		 System.out.println(doctorid);
		 String customerid=request.getParameter("customerid");
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
	       TestregBO u=new TestregBO();
	       boolean status=u.addtestreg(reportid,customerid,doctorid,medicareserviceid,agentid,servicedate,testresultdate,diag1value,diag1range,diag2value,diag2range,diag3value,diag3range,diag4value,diag4range,diag5value,diag5range,diag6value,diag6range,doctorcomments,otherinfo);
	       if (status)
	       { RequestDispatcher rd=request.getRequestDispatcher("userhome.jsp");
	          rd.forward(request, response);
	       }
	       else
	       { RequestDispatcher rd=request.getRequestDispatcher("userhome.jsp");
	       rd.forward(request, response);			
		}		       
}	
}
