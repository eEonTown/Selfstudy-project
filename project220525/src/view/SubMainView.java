package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Controller;
import model.User;

public class SubMainView{
	
	public void subMainView() {
		
		Scanner sc = new Scanner(System.in);
		Controller c = new Controller();
		
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
			case 2 :
				ArrayList<User> user = c.viewUser();
				System.out.println("\n\n■ " + user.get(0).getUserName() + "님의 정보");
				System.out.println("■ " + user.get(0).toString() + "\n\n");
				break;
			case 3 : 
				
			case 4 : 
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
