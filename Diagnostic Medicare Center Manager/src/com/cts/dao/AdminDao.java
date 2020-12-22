package com.cts.dao;
import java.sql.*;
import java.util.Random;

import javax.servlet.http.HttpSession;

import com.cts.DbConn;
import com.cts.admregistration;

import users.cts.Admin;
public class AdminDao {

	public boolean addAdmin(Admin u)
	{ /* this method is to admin details into database	*/
		try {
		Connection con=DbConn.getConn();
		admregistration r=new admregistration();
		PreparedStatement pst=con.prepareStatement("insert into admin(adminid,firstname,lastname,age,gender,dob,contact,altcontact,email,password) values(?,?,?,?,?,?,?,?,?,?)");
		pst.setString(1,u.getAdminId());
		pst.setString(2, u.getFirstName());
		pst.setString(3, u.getLastName());
		pst.setString(4, u.getAge());
		pst.setString(5, u.getGender());
		pst.setString(6, u.getDoB());
		pst.setString(7, u.getContactNumber());
		pst.setString(8, u.getAltContactNumber());
		pst.setString(9, u.getEmailID());
		pst.setString(10, u.getPassword());
		
		pst.execute();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return true;
   }
	
	/* end of dao class	*/
		
	}