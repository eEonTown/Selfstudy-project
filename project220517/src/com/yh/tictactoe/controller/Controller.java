package com.yh.tictactoe.controller;

import java.util.ArrayList;

import com.yh.tictactoe.user.User1;

public class Controller {
	
	ArrayList<User1> userList = new ArrayList<User1>();
	
	public void createUser(String userName) {
		
		userList.add(new User1(userName, 0, 0, 0, "∫Í∑–¡Ó"));
	}
	
	
	
	public ArrayList<User1> userInfo() {
		return userList;
	}
	
	


}
