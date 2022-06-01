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
	 *	����� ���������� 1ȸ�� ��µǴ� ������ �Դϴ�.
	 *	�������� �� �ٽ� ���ƿ� �� �ֽ��ϴ�.
	*/
	public void main() {
		System.out.println("������� Tic �����������������");
		System.out.println("���������� Tac ��������������");
		System.out.println("������������� Toe �����������");
		System.out.println("���������������� Game �������\n");
			
		while(true) {
			System.out.println("�� 1. ��������");
			System.out.println("�� 2. ���Ӽ���");
			System.out.println("�� 0. ��������");
			System.out.print("�� �޴����� => ");
			int menu = sc.nextInt();
			sc.nextLine();
				
			switch(menu) {
			case 1 :
				System.out.println("\n\n�� ���� ���� ȭ������ �̵��մϴ�.\n");
				System.out.print("\n�� �г����� �Է��ϼ��� : ");
				String userName = sc.nextLine();
					
				c.createUser(userName);
		
				System.out.println("\n\n�� ������ �Ϸ� �Ǿ����ϴ�");
				System.out.println(userName + "�� ȯ���մϴ�.\n\n");
				
				sub();
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
				System.exit(0);
			default : 
				System.out.println("\n\n�� �߸��� �޴��� �Է��߽��ϴ� �ٽ� �Է��� �ּ���.\n\n");
			}
		}
	}
	
	
	
	public void sub() {
		
		while(true) {
			System.out.println("�� 1. ���ӽ���");
			System.out.println("�� 2. �� ����");
			System.out.println("�� 3. �г��� ����");
			System.out.println("�� 0. ��������");
			System.out.print("�� �޴����� => ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : 
				gameMenu();
			case 2 :
				ArrayList<User> userInfo = c.viewUser();
				System.out.println("\n\n�� " + userInfo.get(0).getUserName() + "���� ����");
				System.out.println("�� " + userInfo.get(0).toString() + "\n\n");
				break;
			case 3 : 
				System.out.print("\n\n�� ������ �г����� �Է��ϼ��� : ");
				String userName = sc.nextLine();
				
				c.updateUser(userName);
				
				System.out.println("�� ������ �Ϸ��߽��ϴ�.\n\n");
				break;
			case 0 :
				System.out.println("\n\n�� �� ����� Tic �����������������");
				System.out.println("�� �� �������� Tac ��������������");
				System.out.println("�� �� ����������� Toe �����������");
				System.out.println("�� �� �������������� EXIT �������");
				System.exit(0);
			default : 
				System.out.println("\n\n�� �߸��� �޴��� �Է��߽��ϴ� �ٽ� �Է��� �ּ���.\n\n");
			}
		}
	}
	
	
	
	public void gameMenu() {
		System.out.println("\n\n�� ���̵��� ������ �ּ���");
		System.out.println("1. �ʱ�");
		System.out.println("2. �߱�(�ߺ���)");
		System.out.println("3. ���(�غ���)");
		System.out.print("�� �޴����� => ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : 
			System.out.println("\n\n�� ������ �����մϴ�.\n\n");
			g.easyGameStart();
			break;
//		case 2 : 
//		case 3 : 
		default : System.out.println("\n\n�޴��� �߸� �Է��ϼ̽��ϴ�.");
		gameMenu();
		}
	}
}