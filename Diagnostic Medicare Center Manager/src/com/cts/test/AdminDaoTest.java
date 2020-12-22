package com.cts.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cts.DbConn;
import com.cts.admregistration;
import com.cts.dao.AdminDao;

import users.cts.Admin;
import users.cts.User;

public class AdminDaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddAdmin() {
		AdminDao a=new AdminDao();
		Admin u=new Admin();
		u.setFirstName("admin");
		boolean flag=a.addAdmin(u);
		assertEquals(flag,true);
	}

}
