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

	ArrayList<Board> board = new ArrayList<>();
	{
		board.add(new Board("��", "��", "��", "��", "��", "��", "��", "��", "��"));
	}
	
	public ArrayList<Board> boardView() {
		return board;
	}
	
	
	
	public void userTurn(int select) {
		
		switch(select) {
		case 0 : board.get(0).setF1("��"); break;
		case 1 : board.get(0).setF2("��"); break;
		case 2 : board.get(0).setF3("��"); break;
		case 3 : board.get(0).setF4("��"); break;
		case 4 : board.get(0).setF5("��"); break;
		case 5 : board.get(0).setF6("��"); break;
		case 6 : board.get(0).setF7("��"); break;
		case 7 : board.get(0).setF8("��"); break;
		case 8 : board.get(0).setF9("��"); break;
		}
	}
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}