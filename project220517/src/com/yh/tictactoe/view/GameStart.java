package com.yh.tictactoe.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.yh.tictactoe.controller.Board;
import com.yh.tictactoe.controller.Controller;

public class GameStart {
	
	Scanner sc = new Scanner(System.in);
	Controller controller = new Controller();
	
	public void game() {
		

		
		while(true) {
			ArrayList<Board> board = controller.boardView();
			System.out.println(board.toString());
			System.out.println("당신 차례 입니다.");
			System.out.println("좌표를 입력하세요(0 ~ 8)");
			System.out.print("■ 좌표선택 => ");
			int select = sc.nextInt();	
			
			controller.userTurn(select);
		}
	}
	

}
