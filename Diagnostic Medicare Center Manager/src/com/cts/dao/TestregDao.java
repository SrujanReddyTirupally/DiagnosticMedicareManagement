package com.cts.dao;
import java.sql.*;

import com.cts.DbConn;
import com.cts.testreg;

import users.cts.Testreg;
public class TestregDao {

	public boolean addtestreg(Testreg u)
	{ try {
		Connection con=DbConn.getConn();
		testreg r=new testreg();
		PreparedStatement pst=con.prepareStatement("insert into testhistory(reportid,customerid,doctorid,medicareserviceid,agentid,servicedate,testresultdate,diag1value,diag1range,diag2value,diag2range,diag3value,diag3range,diag4value,diag4range,diag5value,diag5range,diag6value,diag6range,doctorcomments,otherinfo) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		pst.setString(1,u.getReportid());
		pst.setString(2, u.getCustomerid());
		pst.setString(3, u.getDoctorid());
		pst.setString(4, u.getMedicareserviceid());
		pst.setString(5, u.getAgentid());
		pst.setString(6, u.getServicedate());
		pst.setString(7, u.getTestresultdate());
		pst.setString(8, u.getDiag1range());
		pst.setString(9, u.getDiag1value());
		pst.setString(10, u.getDiag2range());
		pst.setString(11, u.getDiag2value());
		pst.setString(12, u.getDiag3range());
		pst.setString(13, u.getDiag3value());
		pst.setString(14, u.getDiag4range());
		pst.setString(15, u.getDiag4value());
		pst.setString(16, u.getDiag5range());
		pst.setString(17, u.getDiag5value());
		pst.setString(18, u.getDiag6range());
		pst.setString(19, u.getDiag6value());
		pst.setString(20, u.getDoctorcomments());
		pst.setString(21, u.getOtherinfo());
		pst.execute();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	return true;
   }
	
}
