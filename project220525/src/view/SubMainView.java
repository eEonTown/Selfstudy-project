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
			System.out.println("�� 1. ���ӽ���");
			System.out.println("�� 2. �� ����");
			System.out.println("�� 3. �г��� ����");
			System.out.println("�� 4. ��������");
			System.out.println("�� 0. ��������");
			System.out.print("�� �޴����� => ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : 
			case 2 :
				ArrayList<User> user = c.viewUser();
				System.out.println("\n\n�� " + user.get(0).getUserName() + "���� ����");
				System.out.println("�� " + user.get(0).toString() + "\n\n");
				break;
			case 3 : 
				
			case 4 : 
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
