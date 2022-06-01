package project.view;

import java.util.ArrayList;
import java.util.Scanner;

import project.controller.Controller;
import project.model.User;

public class Main {
	
	Scanner sc = new Scanner(System.in);
	Controller c = new Controller();
	Game g = new Game();
	
	/*
	 *	실행시 계정생성전 1회만 출력되는 페이지 입니다.
	 *	계정삭제 후 다시 돌아올 수 있습니다.
	*/
	public void main() {
		System.out.println("■■■■■■ Tic ■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■ Tac ■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■ Toe ■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■ Game ■■■■■■\n");
			
		while(true) {
			System.out.println("■ 1. 계정생성");
			System.out.println("■ 2. 게임설명");
			System.out.println("■ 0. 게임종료");
			System.out.print("■ 메뉴선택 => ");
			int menu = sc.nextInt();
			sc.nextLine();
				
			switch(menu) {
			case 1 :
				System.out.println("\n\n■ 계정 생성 화면으로 이동합니다.\n");
				System.out.print("\n■ 닉네임을 입력하세요 : ");
				String userName = sc.nextLine();
					
				c.createUser(userName);
		
				System.out.println("\n\n■ 생성이 완료 되었습니다");
				System.out.println(userName + "님 환영합니다.\n\n");
				
				sub();
				break;
			case 2 :  
				System.out.println("\n\n■ 3 X 3의 정사각형에서 가로나 세로, 대각선 중");
				System.out.println("■ 하나의 줄을 먼저 완성하는 사람이 이기는 게임입니다.\n\n");
				break;
			case 0 : 
				System.out.println("\n\n■ 게 ■■■■ Tic ■■■■■■■■■■■■■■■■");
				System.out.println("■ 임 ■■■■■■■ Tac ■■■■■■■■■■■■■");
				System.out.println("■ 종 ■■■■■■■■■■ Toe ■■■■■■■■■■");
				System.out.println("■ 료 ■■■■■■■■■■■■■ EXIT ■■■■■■");
				System.exit(0);
			default : 
				System.out.println("\n\n■ 잘못된 메뉴를 입력했습니다 다시 입력해 주세요.\n\n");
			}
		}
	}
	
	
	
	public void sub() {
		
		while(true) {
			System.out.println("■ 1. 게임시작");
			System.out.println("■ 2. 내 정보");
			System.out.println("■ 3. 닉네임 수정");
			System.out.println("■ 0. 게임종료");
			System.out.print("■ 메뉴선택 => ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : 
				gameMenu();
			case 2 :
				ArrayList<User> userInfo = c.viewUser();
				System.out.println("\n\n■ " + userInfo.get(0).getUserName() + "님의 정보");
				System.out.println("■ " + userInfo.get(0).toString() + "\n\n");
				break;
			case 3 : 
				System.out.print("\n\n■ 수정할 닉네임을 입력하세요 : ");
				String userName = sc.nextLine();
				
				c.updateUser(userName);
				
				System.out.println("■ 수정을 완료했습니다.\n\n");
				break;
			case 0 :
				System.out.println("\n\n■ 게 ■■■■ Tic ■■■■■■■■■■■■■■■■");
				System.out.println("■ 임 ■■■■■■■ Tac ■■■■■■■■■■■■■");
				System.out.println("■ 종 ■■■■■■■■■■ Toe ■■■■■■■■■■");
				System.out.println("■ 료 ■■■■■■■■■■■■■ EXIT ■■■■■■");
				System.exit(0);
			default : 
				System.out.println("\n\n■ 잘못된 메뉴를 입력했습니다 다시 입력해 주세요.\n\n");
			}
		}
	}
	
	
	
	public void gameMenu() {
		System.out.println("\n\n■ 난이도를 선택해 주세요");
		System.out.println("1. 초급");
		System.out.println("2. 중급(중비중)");
		System.out.println("3. 고급(준비중)");
		System.out.print("■ 메뉴선택 => ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : 
			System.out.println("\n\n■ 게임을 시작합니다.\n\n");
			g.easyGameStart();
			break;
//		case 2 : 
//		case 3 : 
		default : System.out.println("\n\n메뉴를 잘못 입력하셨습니다.");
		gameMenu();
		}
	}
}