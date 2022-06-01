package view;

import java.util.Scanner;
import controller.Controller;

public class MainView {
	
	Scanner sc = new Scanner(System.in);
	Controller c = new Controller();
	SubMainView sub = new SubMainView();
	
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
				
				String a = c.createUser(userName);
				
				System.out.println(a);
				
				
				
				System.out.println("\n\n�� ������ �Ϸ� �Ǿ����ϴ�");
				System.out.println(userName + "�� ȯ���մϴ�.\n\n");
				
				sub.subMainView();
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
}