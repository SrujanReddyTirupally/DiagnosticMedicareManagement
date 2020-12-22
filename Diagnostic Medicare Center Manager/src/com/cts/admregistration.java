package com.cts;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.cts.AdminBO;

@WebServlet("/admregistration")
public class admregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Random ran=new Random();
		int id=ran.nextInt(100000);
		String AdminId=new Integer(id).toString();
		System.out.println(AdminId);
       String FirstName=request.getParameter("First Name");
       String LastName=request.getParameter("Last Name");
       String Age=request.getParameter("Age");
       String Gender=request.getParameter("Gender");
       String DoB=request.getParameter("DoB");
       String ContactNumber=request.getParameter("Contact Number");
       String AltContactNumber=request.getParameter("Alt Contact Number");
       String EmailID=request.getParameter("Email ID");
       String Password=request.getParameter("Password");
       
       AdminBO u=new AdminBO();
       HttpSession session =request.getSession();
       session.setAttribute("uname",FirstName);  
       session.setAttribute("uid",AdminId);
       boolean status=u.addAdmin(AdminId,FirstName,LastName,Age,Gender,DoB,ContactNumber,AltContactNumber,EmailID,Password);
       if (status)
       { RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
          rd.forward(request, response);
       }
       else
       { RequestDispatcher rd=request.getRequestDispatcher("adminregistration.jsp");
       rd.forward(request, response);
    }    				
		
		
		
	}

}
