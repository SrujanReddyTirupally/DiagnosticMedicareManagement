package com.cts;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;
public class DbConn {

	public static Connection getConn() throws Exception
	{
		              
		              
		         Connection con=null;
		
			          Class.forName("com.mysql.jdbc.Driver");
			 		  return con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diagnosticmedicare","root","root");
		}
		 
		      
	}
