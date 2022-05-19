package com.yh.tictactoe.controller;

import java.util.ArrayList;

import com.yh.tictactoe.user.User1;

public class Controller {
	
	ArrayList<User1> userList = new ArrayList<User1>();
	
	
//	user controll==========================================================
	
	/**
	 * @param userName
	 * ���������� �����ϴ� �޼ҵ�
	 */
	public void createUser(String userName) {
		userList.add(new User1(userName, 0, 0, 0, "�����"));
	}
	
	
	
	/**
	 * @return userList
	 * ���� ������ �����
	 */
	public ArrayList<User1> userInfo() {
		return userList;
	}
	
	
	
	/**
	 * @param reName
	 * @return userList
	 * ���� �г����� ������
	 */
	public ArrayList<User1> reName(String reName){	
		userList.get(0).setUserName(reName);
		return userList;
	}
	
	
	
	/**
	 * @param answer
	 * @return int
	 * ���� ������ ������ || �������� 1 || �������� 0 
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
		char[] board = {'��', '��', '��', '��' ,'��' ,'��' ,'��', '��', '��'};
		return board;
	}
	
	
	
	public void userTurn() {
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}