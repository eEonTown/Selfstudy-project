package com.yh.user.model.service;

import java.sql.Connection;

import static com.yh.common.JDBCTemplate.*;
import com.yh.user.model.dao.UserDao;
import com.yh.user.model.vo.User;

public class UserService {
	public User userLogin(String userId, String userPwd) {
		
		Connection conn = getConnection();
		
		User user = new UserDao().userLogin(conn, userId, userPwd);
		
		close(conn);
		
		return user;
	}
	
	public int userJoin(User user) {
		
		Connection conn = getConnection();
		
		int result = new UserDao().userJoin(conn, user);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}
}
