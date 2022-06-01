package project.controller;

import java.util.ArrayList;

import project.model.Board;
import project.model.User;

public class Controller {
	
	ArrayList<User> userInfo = new ArrayList<>();
	
	/**
	 * ������ ������ �߰� �����ִ� ��ûó�� �޼ҵ�
	 * @param userName ����ڰ� �Է��� �߰��ϰ����ϴ� �̸�
	 */
	public void createUser(String userName) {
		userInfo.add(new User(userName, 0,0,0, "�����"));
	}
	
	
	
	/**
	 * ������ ���� ����Ʈ�� ��ȯ�����ִ� ��ûó�� �޼ҵ�
	 * @return ���� ������ ������ ����� �ִ� ArrayList
	 */
	public ArrayList<User> viewUser() {
		return userInfo;
	}
	
	
	
	/**������ ���� �г����� ������Ű�� ��ûó�� �޼ҵ�
	 * @param userName ����ڰ� �Է��� �����ϰ����ϴ� �̸�
	 */
	public void updateUser(String userName) {
		userInfo.get(0).setUserName(userName);
	}
	
	
	
//	========================================
//	board
//	========================================
	


}
