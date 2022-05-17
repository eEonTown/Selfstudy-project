package com.yh.tictactoe.view;

import java.util.Scanner;

import com.yh.tictactoe.controller.Controller;

public class View {

	Scanner sc = new Scanner(System.in);
	GameStart gameStart = new GameStart();
	Controller controller = new Controller();
	
	public void main() {
		System.out.println("■■■■■■ Tic ■■■■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■ Tac ■■■■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■ Toe ■■■■■■■■■■");
		System.out.println("■■■■■■■■■■■■■■■ Game ■■■■■■\n");
		
		
		while(true) {
			System.out.println("■ 1. 캐릭터생성");
			System.out.println("■ 2. 게임설명");
			System.out.println("■ 0. 게임종료");
			System.out.print("■ 메뉴선택 => ");
			int menu = sc.nextInt();
			sc.nextLine();
				
			switch(menu) {
				case 1 :
					System.out.println("\n\n■ 캐릭터 생성 화면으로 이동합니다.");
					create();
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
					return;
				default : 
					System.out.println("■ 잘못된 메뉴를 입력했습니다 다시 입력해 주세요.");
			}
		}
	}
	
	
	
	public void create() {
		
		System.out.print("\n■ 닉네임을 입력하세요 : ");
		String userName = sc.nextLine();
		
		controller.createUser(userName);
		System.out.println("\n■ 생성이 완료 되었습니다");
		System.out.println(userName + "님 환영합니다.");
		
		start();
		

	}
	
	
	
	public void start() {
		
		while(true) {
			System.out.println("■ 1. 게임시작");
			System.out.println("■ 2. 내 정보");
			System.out.println("■ 0. 게임종료");
			System.out.print("■ 메뉴선택 => ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
			case 2 :
				System.out.println("\n\n■ " + controller.userInfo().get(0).getUserName() + "님의 정보");
				System.out.println(controller.userInfo().get(0).toString() + "\n\n");
				break;
			case 0 :
				System.out.println("\n\n■ 게 ■■■■ Tic ■■■■■■■■■■■■■■■■");
				System.out.println("■ 임 ■■■■■■■ Tac ■■■■■■■■■■■■■");
				System.out.println("■ 종 ■■■■■■■■■■ Toe ■■■■■■■■■■");
				System.out.println("■ 료 ■■■■■■■■■■■■■ EXIT ■■■■■■");
				System.exit(0);
			default : 
				System.out.println("■ 잘못된 메뉴를 입력했습니다 다시 입력해 주세요.");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}