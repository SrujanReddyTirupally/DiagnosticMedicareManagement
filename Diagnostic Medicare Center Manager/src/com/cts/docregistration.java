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

import bo.cts.DoctorBO;
@WebServlet("/docregistration")
public class docregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter(); 
		Random ran=new Random();
		int id=ran.nextInt(100000);
		String DoctorId=new Integer(id).toString();
		System.out.println(DoctorId);
		int did=ran.nextInt(100000);
		String MedicareServiceID=new Integer(did).toString();
		System.out.println(MedicareServiceID);
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
       String Degree=request.getParameter("Degree");
       String Specialty=request.getParameter("Specialty");
       String Workhours=request.getParameter("Work hours");
       String HospitalName=request.getParameter("Hospital Name");
       DoctorBO u=new DoctorBO();
       HttpSession session =request.getSession();
       session.setAttribute("uname",FirstName);  
       session.setAttribute("uid",DoctorId);
       boolean status=u.addDoctor(DoctorId,FirstName,LastName,Age,Gender,DoB,ContactNumber,AltContactNumber,EmailID,Password,AddressLine1,AddressLine2,City,State,ZipCode,Degree,Specialty,Workhours,HospitalName,MedicareServiceID);
       if (status)
       { RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
          rd.forward(request, response);
       }
       else
       { RequestDispatcher rd=request.getRequestDispatcher("doctorregistration.jsp");
       rd.forward(request, response);			
	}
}
}
