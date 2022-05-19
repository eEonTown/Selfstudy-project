package com.yh.tictactoe.view;

import java.util.Scanner;

import com.yh.tictactoe.controller.Controller;

public class View {

	Scanner sc = new Scanner(System.in);
	GameStart gameStart = new GameStart();
	Controller controller = new Controller();
	
	
	
//	게임 시작전 출력되는 메소드
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
					System.exit(0);
				default : 
					System.out.println("■ 잘못된 메뉴를 입력했습니다 다시 입력해 주세요.");
			}
		}
	}
	
	
	
//	유저의 계정을 생성한뒤 start메소드로 넘어감
	public void create() {
		
		System.out.print("\n■ 닉네임을 입력하세요 : ");
		String userName = sc.nextLine();
		
		controller.createUser(userName);
		System.out.println("\n■ 생성이 완료 되었습니다");
		System.out.println(userName + "님 환영합니다.");
		
		start();
	}
	
	
	
//	게임 시작전 정보, 수정, 삭제등의 메뉴선택 창
	public void start() {
		
		while(true) {
			System.out.println("■ 1. 게임시작");
			System.out.println("■ 2. 내 정보");
			System.out.println("■ 3. 닉네임 수정");
			System.out.println("■ 4. 계정삭제");
			System.out.println("■ 0. 게임종료");
			System.out.print("■ 메뉴선택 => ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
				System.out.println("\n\n■ 게임을 시작합니다.\n\n");
				gameStart.game();
				return;
			case 2 :
				System.out.println("\n\n■ " + controller.userInfo().get(0).getUserName() + "님의 정보");
				System.out.println(controller.userInfo().get(0).toString() + "\n\n");
				break;
			case 3: 
				System.out.print("\n\n■ 수정할 닉네임을 입력하세요 : ");
				String reName = sc.nextLine();
				controller.reName(reName);
				System.out.println("■ 수정이 완료 되었습니다.\n\n");
				break;
			case 4: 
				System.out.println("\n\n■ 정말로 삭제 하시겠습니까?(y)");
				System.out.print("■ 삭제를 원하지 않는다면 아무키나 눌러주세요 : ");
				char answer = sc.nextLine().charAt(0);
				
				int result = controller.remove(answer);
				
				if(result > 0) {
					System.out.println("\n\n■ 성공적으로 삭제 되었습니다. 초기화면 으로 돌아갑니다.\n\n");
					main();
				}else{
					System.out.println("\n\n■ 이전 화면으로 돌아갑니다.\n\n");
				}
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