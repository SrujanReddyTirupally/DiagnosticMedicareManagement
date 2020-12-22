package com.cts.dao;

import java.sql.*;
import java.util.Random;

import javax.servlet.http.HttpSession;

import com.cts.DbConn;
import com.cts.registration;

import users.cts.User;
public class UserDao {

	public boolean addUser(User u)
	{ try {
		Connection con=DbConn.getConn();
		registration r=new registration();
		PreparedStatement pst=con.prepareStatement("insert into customer(userid,firstname,lastname,age,gender,dob,contact,altcontact,email,password,address1,address2,city,state,zipcode) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		pst.setString(1,u.getUserId());
		pst.setString(2, u.getFirstName());
		pst.setString(3, u.getLastName());
		pst.setString(4, u.getAge());
		pst.setString(5, u.getGender());
		pst.setString(6, u.getDoB());
		pst.setString(7, u.getContactNumber());
		pst.setString(8, u.getAltContactNumber());
		pst.setString(9, u.getEmailID());
		pst.setString(10, u.getPassword());
		pst.setString(11, u.getAddressLine1());
		pst.setString(12, u.getAddressLine2());
		pst.setString(13, u.getCity());
		pst.setString(14, u.getState());
		pst.setString(15, u.getZipCode());
		pst.execute();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return true;
   }
	
	
		
	}

