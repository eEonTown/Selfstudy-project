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
			System.out.println("��� ���� �Դϴ�.");
			System.out.println("��ǥ�� �Է��ϼ���(0 ~ 8)");
			System.out.print("�� ��ǥ���� => ");
			int select = sc.nextInt();	
			
			controller.userTurn(select);
		}
	}
	

}
