package project.view;

import java.util.ArrayList;
import java.util.Scanner;

import project.controller.Controller;
import project.model.Board;

public class Game {
	
	Scanner sc = new Scanner(System.in);
	Controller c = new Controller();
	
	public void easyGameStart() {
		
//		������
		char[][] board = new char[3][3];
		
//		������ �ʱ�ȭ
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '��';
			}
		}
		
		do {
//			������ ���
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.print(board[i][j] + " ");
					if(j == 2) {
						System.out.print("\n");
					}
				}
			}
			
//			����ڿ��� ��ǥ�Է� ��û
			System.out.print("x��ǥ�� �Է��ϼ��� : ");
			int x = sc.nextInt();
			System.out.print("y��ǥ�� �Է��ϼ��� : ");
			int y = sc.nextInt();
			System.out.println("\n");
			
//			����ڰ� �Է��� ��ġ����
//			��ǻ�� Ȥ�� ����ڰ� �̹� ���� ���� �ڸ���� ��¹� ���
//			���� ���� �ڸ���� ������� �� ����
			if(board[x][y] == '��' || board[x][y] == '��') {
				System.out.println("�̹� �����߽��ϴ�.\n\n");
				continue;
			}else {
				board[x][y] = '��';
			}
			
			//��ǻ�� ����
			int cx = (int)(Math.random() * 2);
			int cy = (int)(Math.random() * 2);
			
			
			
			
			
		} while(true);

			
			
		

	}
}
