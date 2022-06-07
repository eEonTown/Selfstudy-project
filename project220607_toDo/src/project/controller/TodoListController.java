package project.controller;

import java.util.ArrayList;

import project.model.service.TodoListService;
import project.model.vo.TodoList;
import project.view.TodoListView;

public class TodoListController {
	
	public void listView() {
		
		ArrayList<TodoList> list = new TodoListService().listView();
		
		if(list.isEmpty()) {
			new TodoListView().message("\n조회 결과가 없습니다.\n");
		}else {
			new TodoListView().todoListAllView(list);
		}
	}
	
	
	public void addList(String todo) {
		
		int result = new TodoListService().addList(todo);
	
		if(result > 0) {
			new TodoListView().message("\n추가 되었습니다.\n");
		}else {
			new TodoListView().message("\n추가에 실패했습니다.\n");
		}
	}
	
	
	public void deleteList(int delete) {
		
		int result = new TodoListService().deleteList(delete);
	
		if(result > 0) {
			new TodoListView().message("\n삭제 되었습니다.\n");
		}else {
			new TodoListView().message("\n삭제에 실패했습니다.\n");
		}
	}
	
	
	
	public void updateList(int update, String todo) {
		
		int result = new TodoListService().updateList(update, todo);
	
		if(result > 0) {
			new TodoListView().message("\n수정 되었습니다.\n");
		}else {
			new TodoListView().message("\n수정에 실패했습니다.\n");
		}
	}
	
	
	
	public void checkList(int update, String check) {
		
		int result = new TodoListService().checkList(update, check);
	
		if(result > 0) {
			new TodoListView().message("\n수정 되었습니다.\n");
		}else {
			new TodoListView().message("\n수정에 실패했습니다.\n");
		}
	}
	
	
	
	public void searchList(String keyword) {
		
		ArrayList<TodoList> list = new TodoListService().searchList(keyword);
		
		if(list.isEmpty()) {
			new TodoListView().message("\n조회 결과가 없습니다.\n");
		}else {
			new TodoListView().todoListAllView(list);
		}
	}
}
