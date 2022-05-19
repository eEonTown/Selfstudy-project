package com.yh.tictactoe.view;

import java.util.Scanner;

import com.yh.tictactoe.controller.Controller;

public class GameStart {
	
	Scanner sc = new Scanner(System.in);
	Controller controller = new Controller();
	
	public void game() {
		
		char[] board = controller.board();
		
		System.out.println(board[0] + " " + board[1] + " " + board[2]);
		System.out.println(board[3] + " " + board[4] + " " + board[5]);
		System.out.println(board[6] + " " + board[8] + " " + board[8]);
		
		System.out.print("좌표를 입력하세요(0~8) : ");
		int target = sc.nextInt();
		sc.nextLine();
		
		controller.userTurn();
	}
	

}
