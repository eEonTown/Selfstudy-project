package controller;

import java.util.ArrayList;

import model.User;

public class Controller {

	public ArrayList<User> userInfo = new ArrayList<User>();	//������ ������ ��� �ִ� ����Ʈ
//	{
//		userInfo.add(new User("�ֿ���", 10, 0, 0, "�����"));
//	}
	
	
	/**
	 * ������ ������ �߰� �����ִ� ��ûó�� �޼ҵ�
	 * @param userName ����ڰ� �Է��� �߰��ϰ����ϴ� �̸�
	 */
	public String createUser(String userName) {
		userInfo.add(new User(userName, 0,0,0, "�����"));
		
		System.out.println("\n\n�� " + userInfo.get(0).getUserName() + "���� ����");
		System.out.println("�� " + userInfo.get(0).toString() + "\n\n");
		
		return userInfo.get(0).getUserName();
	}
	
	
	
	/**
	 * ������ ���� ����Ʈ�� ��ȯ�����ִ� ��ûó�� �޼ҵ�
	 * @return ���� ������ ������ ����� �ִ� ArrayList
	 */
	public ArrayList<User> viewUser() {
		return userInfo;
	}
}
