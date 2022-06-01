package project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import project.model.vo.User;

public class Database {
	
	public int createUser(String userId, String userPwd) {
		
		int result = 0;
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "LOGIN_PROJECT_01";
		String pwd = "LOGIN_PROJECT_01";
		
		Connection conn = null;
		Statement stmt = null;
		
		String sql = "INSERT INTO USER_INFO"
				   + " VALUES (SEQ_USER.NEXTVAL, '" + userId + "', '" + userPwd + "')";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pwd);
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				conn.commit();
			}else {
				conn.rollback();
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
	
	
	
	public ArrayList<User> login(String userId, String userPwd) {
		
		ArrayList<User> user = new ArrayList<>();
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "LOGIN_PROJECT_01";
		String pwd = "LOGIN_PROJECT_01";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT USER_NO, USER_ID, USER_PWD FROM USER_INFO WHERE USER_ID = '" + userId + "' AND USER_PWD = '" + userPwd + "'";
				
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pwd);
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next()) {
				user.add(new User(rset.getInt("USER_NO"), rset.getString("USER_ID"), rset.getString("USER_PWD")));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rset.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return user;
	}
}