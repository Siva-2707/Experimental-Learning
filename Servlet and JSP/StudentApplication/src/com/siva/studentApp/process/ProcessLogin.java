package com.siva.studentApp.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.siva.studentApp.dao.DBUtil;

public class ProcessLogin {
	public boolean validate(String uname, String password) {
		
		try (Connection con = DBUtil.getConnection();
				PreparedStatement pstmt = con.prepareStatement("SELECT * FROM customer WHERE username=? AND password = ?");) {
			pstmt.setString(1, uname);
			pstmt.setString(2, password);
			 ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
