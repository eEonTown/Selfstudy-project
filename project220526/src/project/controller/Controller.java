package project.controller;

import java.util.ArrayList;

import project.model.Board;
import project.model.User;

public class Controller {
	
	ArrayList<User> userInfo = new ArrayList<>();
	
	/**
	 * 유저의 계정을 추가 시켜주는 요청처리 메소드
	 * @param userName 사용자가 입력한 추가하고자하는 이름
	 */
	public void createUser(String userName) {
		userInfo.add(new User(userName, 0,0,0, "브론즈"));
	}
	
	
	
	/**
	 * 유저의 정보 리스트를 반환시켜주는 요청처리 메소드
	 * @return 현재 유저의 정보가 담겨져 있는 ArrayList
	 */
	public ArrayList<User> viewUser() {
		return userInfo;
	}
	
	
	
	/**유저의 계정 닉네임을 수정시키는 요청처리 메소드
	 * @param userName 사용자가 입력한 수정하고자하는 이름
	 */
	public void updateUser(String userName) {
		userInfo.get(0).setUserName(userName);
	}
	
	
	
//	========================================
//	board
//	========================================
	


}
