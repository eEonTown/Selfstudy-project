package controller;

import java.util.ArrayList;

import model.User;

public class Controller {

	public ArrayList<User> userInfo = new ArrayList<User>();	//유저의 정보를 담고 있는 리스트
//	{
//		userInfo.add(new User("최영헌", 10, 0, 0, "브론즈"));
//	}
	
	
	/**
	 * 유저의 계정을 추가 시켜주는 요청처리 메소드
	 * @param userName 사용자가 입력한 추가하고자하는 이름
	 */
	public String createUser(String userName) {
		userInfo.add(new User(userName, 0,0,0, "브론즈"));
		
		System.out.println("\n\n■ " + userInfo.get(0).getUserName() + "님의 정보");
		System.out.println("■ " + userInfo.get(0).toString() + "\n\n");
		
		return userInfo.get(0).getUserName();
	}
	
	
	
	/**
	 * 유저의 정보 리스트를 반환시켜주는 요청처리 메소드
	 * @return 현재 유저의 정보가 담겨져 있는 ArrayList
	 */
	public ArrayList<User> viewUser() {
		return userInfo;
	}
}
