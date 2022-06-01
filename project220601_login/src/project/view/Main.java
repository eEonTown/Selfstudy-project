package project.view;

import java.util.ArrayList;
import java.util.Scanner;

import project.controller.Database;
import project.model.vo.User;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	Database db = new Database();
	
	public void menu() {
		
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.print("메뉴선택 => ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
				case 1 : login(); break;
				case 2 : create(); break;
				default : System.out.println("메뉴를 제대로 선택하세요");
			}
		}
	}
	
	
	public void login() {
		System.out.println("\n\n===== 로그인 =====");
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		ArrayList<User> user = db.login(userId, userPwd);
		
		if(user.isEmpty()) {
			System.out.println("\n\n없는 계정 입니다.\n\n");
		}else {
			System.out.println("\n\n로그인 성공\n\n");
		}
		
	}
	
	
	public void create() {
		System.out.println("\n\n===== 회원가입 =====");
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		System.out.print("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		int result = db.createUser(userId, userPwd);
		
		if(result > 0) {
			System.out.println("\n\n회원가입 완료\n\n");
		}else {
			System.out.println("\n\n회원가입 실패\n\n");
		}
	}
}