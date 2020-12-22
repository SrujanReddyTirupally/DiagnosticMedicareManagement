package com.cts.dao;
import java.sql.*;

import com.cts.DbConn;
import com.cts.medicareregistration;

import users.cts.Medicare;
public class MedicareDao {

	public boolean addMedicare(Medicare u)
	{ try {
		Connection con=DbConn.getConn();
		medicareregistration r=new medicareregistration();
		PreparedStatement pst=con.prepareStatement("insert into medicareservices(MedicareServiceId,MedicareService,ServiceDescription,Amount) values(?,?,?,?)");
		pst.setString(1,u.getMedicareServiceId());
		pst.setString(2, u.getMedicareService());
		pst.setString(3, u.getServiceDescription());
		pst.setString(4, u.getAmount());
		pst.execute();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return true;
   }		
}
