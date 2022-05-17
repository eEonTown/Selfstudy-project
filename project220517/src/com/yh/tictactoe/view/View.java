package com.yh.tictactoe.view;

import java.util.Scanner;

import com.yh.tictactoe.controller.Controller;

public class View {

	Scanner sc = new Scanner(System.in);
	GameStart gameStart = new GameStart();
	Controller controller = new Controller();
	
	public void main() {
		System.out.println("������� Tic �����������������");
		System.out.println("���������� Tac ��������������");
		System.out.println("������������� Toe �����������");
		System.out.println("���������������� Game �������\n");
		
		
		while(true) {
			System.out.println("�� 1. ĳ���ͻ���");
			System.out.println("�� 2. ���Ӽ���");
			System.out.println("�� 0. ��������");
			System.out.print("�� �޴����� => ");
			int menu = sc.nextInt();
			sc.nextLine();
				
			switch(menu) {
				case 1 :
					System.out.println("\n\n�� ĳ���� ���� ȭ������ �̵��մϴ�.");
					create();
					break;
				case 2 :  
					System.out.println("\n\n�� 3 X 3�� ���簢������ ���γ� ����, �밢�� ��");
					System.out.println("�� �ϳ��� ���� ���� �ϼ��ϴ� ����� �̱�� �����Դϴ�.\n\n");
					break;
				case 0 : 
					System.out.println("\n\n�� �� ����� Tic �����������������");
					System.out.println("�� �� �������� Tac ��������������");
					System.out.println("�� �� ����������� Toe �����������");
					System.out.println("�� �� �������������� EXIT �������");
					return;
				default : 
					System.out.println("�� �߸��� �޴��� �Է��߽��ϴ� �ٽ� �Է��� �ּ���.");
			}
		}
	}
	
	
	
	public void create() {
		
		System.out.print("\n�� �г����� �Է��ϼ��� : ");
		String userName = sc.nextLine();
		
		controller.createUser(userName);
		System.out.println("\n�� ������ �Ϸ� �Ǿ����ϴ�");
		System.out.println(userName + "�� ȯ���մϴ�.");
		
		start();
		

	}
	
	
	
	public void start() {
		
		while(true) {
			System.out.println("�� 1. ���ӽ���");
			System.out.println("�� 2. �� ����");
			System.out.println("�� 0. ��������");
			System.out.print("�� �޴����� => ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 :
			case 2 :
				System.out.println("\n\n�� " + controller.userInfo().get(0).getUserName() + "���� ����");
				System.out.println(controller.userInfo().get(0).toString() + "\n\n");
				break;
			case 0 :
				System.out.println("\n\n�� �� ����� Tic �����������������");
				System.out.println("�� �� �������� Tac ��������������");
				System.out.println("�� �� ����������� Toe �����������");
				System.out.println("�� �� �������������� EXIT �������");
				System.exit(0);
			default : 
				System.out.println("�� �߸��� �޴��� �Է��߽��ϴ� �ٽ� �Է��� �ּ���.");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}