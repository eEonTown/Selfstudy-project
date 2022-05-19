package com.yh.tictactoe.controller;

import java.util.ArrayList;

import com.yh.tictactoe.user.User1;

public class Controller {
	
	ArrayList<User1> userList = new ArrayList<User1>();
	
	
//	user controll==========================================================
	
	/**
	 * @param userName
	 * 유저계정을 생성하는 메소드
	 */
	public void createUser(String userName) {
		userList.add(new User1(userName, 0, 0, 0, "브론즈"));
	}
	
	
	
	/**
	 * @return userList
	 * 유저 정보를 출력함
	 */
	public ArrayList<User1> userInfo() {
		return userList;
	}
	
	
	
	/**
	 * @param reName
	 * @return userList
	 * 유저 닉네임을 수정함
	 */
	public ArrayList<User1> reName(String reName){	
		userList.get(0).setUserName(reName);
		return userList;
	}
	
	
	
	/**
	 * @param answer
	 * @return int
	 * 유저 계정을 삭제함 || 삭제성공 1 || 삭제실패 0 
	 */
	public int remove(char answer) {
		int result;
		
		if(answer == 'y' || answer == 'Y') {
			userList.remove(0);
			result = 1;
		}else {
			result = 0;
		}
		
		return result;
	}
	
	
	
//	game controll==========================================================
	
	public char[] board() {
		char[] board = {'□', '□', '□', '□' ,'□' ,'□' ,'□', '□', '□'};
		return board;
	}
	
	
	
	public void userTurn() {
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}