package com.cts;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.cts.UserBO;

@WebServlet("/registration")
public class registration extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	    
		Random ran=new Random();
		int id=ran.nextInt(100000);
		String UserId=new Integer(id).toString();
		System.out.println(UserId);
       String FirstName=request.getParameter("First Name");
       String LastName=request.getParameter("Last Name");
       String Age=request.getParameter("Age");
       String Gender=request.getParameter("Gender");
       String DoB=request.getParameter("DoB");
       String ContactNumber=request.getParameter("Contact Number");
       String AltContactNumber=request.getParameter("Alt Contact Number");
       String EmailID=request.getParameter("Email ID");
       String Password=request.getParameter("Password");
       String AddressLine1=request.getParameter("Address Line 1");
       String AddressLine2=request.getParameter("Address Line 2");
       String City=request.getParameter("City");
       String State=request.getParameter("State");
       String ZipCode=request.getParameter("Zip Code");
       UserBO u=new UserBO();
       HttpSession session =request.getSession();
       session.setAttribute("uname",FirstName);  
       session.setAttribute("uid",UserId);
       boolean status=u.addUser(UserId,FirstName,LastName,Age,Gender,DoB,ContactNumber,AltContactNumber,EmailID,Password,AddressLine1,AddressLine2,City,State,ZipCode);
       if (status)
       { RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
          rd.forward(request, response);
       }
       else
       { RequestDispatcher rd=request.getRequestDispatcher("userregistration.jsp");
       rd.forward(request, response);
    }    			
	}
}
