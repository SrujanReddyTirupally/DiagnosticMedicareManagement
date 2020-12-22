package com.cts.dao;

import java.sql.*;
import java.util.Random;

import javax.servlet.http.HttpSession;

import com.cts.DbConn;
import com.cts.docregistration;

import users.cts.Doctor;
public class DoctorDao {

	public boolean addDoctor(Doctor u)
	{ try {
		Connection con=DbConn.getConn();
		PreparedStatement pst=con.prepareStatement("insert into doctor(doctorid,firstname,lastname,age,gender,dob,contactnumber,altcontactnumber,emailid,password,addressline1,addressline2,city,state,zipcode,degree,specialty,workhours,hospitalName,medicareServiceID) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		pst.setString(1,u.getDoctorId());
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
		pst.setString(16, u.getDegree());
		pst.setString(17, u.getSpecialty());
		pst.setString(18, u.getWorkhours());
		pst.setString(19, u.getHospitalName());
		pst.setString(20, u.getMedicareServiceID());
		pst.execute();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return true;
   }
	
	/*public void removeProduct(String name)
	{try {
		Connection con=DbConn.getConn();
		PreparedStatement pst=con.prepareStatement("delete from products where name=?");
		pst.setString(1, name);
		pst.execute();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	*/
		
	}