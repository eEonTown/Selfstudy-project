package project.view;

import java.util.ArrayList;
import java.util.Scanner;

import project.controller.TodoListController;
import project.model.vo.TodoList;

public class TodoListView {
	
	Scanner sc = new Scanner(System.in);
	TodoListController con = new TodoListController();
	
	public void main() {
		
		while(true) {
			System.out.println("===== To Do List =====");
			System.out.println("1. 리스트 조회");
			System.out.println("2. 리스트 추가");
			System.out.println("3. 리스트 삭제");
			System.out.println("4. 리스트 수정");
			System.out.println("5. 리스트 완료여부");
			System.out.println("6. 리스트 검색");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 > ");
			String menu = sc.nextLine();
			
			switch(menu) {
				case "1" :
					con.listView();
					break;
				case "2" :
					addList();
					break;
				case "3" :
					deleteList();
					break;
				case "4" :
					updateList();
					break;
				case "5" :
					checkList();
					break;
				case "6" :
					searchList();
					break;
				case "0" :
					System.out.println("\n종료합니다.\n");
					return;
				default : System.out.println("\n잘못 입력했습니다 다시 입력하세요\n");
			}
		}
	}
	
	
	
//	조회될 데이터가 여러개 일 때 실행할 메소드
	public void todoListAllView(ArrayList<TodoList> list) {
		for(TodoList a : list) {
			System.out.println(a);
		}

	}
	
	
	
//	요청처리를 성공 실패 유무 확인 메소드
	public void message(String message) {
		System.out.println(message);
	}
	
	
//	할 일을 추가하는 메소드
	public void addList() {
		System.out.println("\n===== 오늘의 할 일 추가 =====");
		System.out.print("할 일을 입력하세요 > ");
		String todo = sc.nextLine();
		
		con.addList(todo);
	}
	
	
//	할 일을 삭제하는 메소드
	public void deleteList() {
		System.out.print("삭제할 번호를 입력하세요 > ");
		int delete = sc.nextInt();
		sc.nextLine();
		
		con.deleteList(delete);
	}
	
	
	
//	할 일을 수정하는 메소드
	public void updateList() {
		System.out.print("수정할 대상 번호를 입력하세요 > ");
		int update = sc.nextInt();
		sc.nextLine();
		System.out.print("할 일 수정 > ");
		String todo = sc.nextLine();
		
		con.updateList(update, todo);
	}
	
	
	
//	할 일 완료여부를 수정하는 메소드
	public void checkList() {
		System.out.print("수정할 대상 번호를 입력하세요 > ");
		int update = sc.nextInt();
		sc.nextLine();
		System.out.print("완료 여부 수정(O,X) > ");
		String check = sc.nextLine();
		
		con.checkList(update, check);
	}
	
	
	
//	할 일을 검색하는 메소드
	public void searchList() {
		System.out.print("검색할 할 일 입력(키워드가능) > ");
		String keyword = sc.nextLine();
		
		con.searchList(keyword);
	}
}