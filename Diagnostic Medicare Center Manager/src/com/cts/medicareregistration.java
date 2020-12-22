package com.cts;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import bo.cts.DoctorBO;
import bo.cts.MedicareBO;
import com.cts.DbConn;
@WebServlet("/medicareregistration")
public class medicareregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter(); 
		String MedicareServiceID=null;
	   String doctorid=request.getParameter("doctorid");
	  
	   try {
		   Connection con=DbConn.getConn();
		String query = "select medicareserviceid from doctor where doctorid=doctorid";
		   PreparedStatement ps = con.prepareStatement(query);
		   ResultSet rs = ps.executeQuery();
		   while (rs.next()) {
			   MedicareServiceID=rs.getString("medicareserviceid");
		   System.out.println(MedicareServiceID);
		   }
	} catch (Exception e) {
		e.printStackTrace();
	}	  
       String MedicareService=request.getParameter("MedicareService");
       String ServiceDescription=request.getParameter("ServiceDescription");
       String Amount=request.getParameter("Amount");  
       MedicareBO u=new MedicareBO();
       boolean status=u.addmedicare(MedicareServiceID,MedicareService,ServiceDescription,Amount);
       if (status)
       { RequestDispatcher rd=request.getRequestDispatcher("doctorhome.jsp");
          rd.forward(request, response);
       }
       else
       { RequestDispatcher rd=request.getRequestDispatcher("doctorhome.jsp");
       rd.forward(request, response);			
	}	
	}
}