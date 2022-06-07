package project.model.service;

import static project.common.JDBCtemplate.*;

import java.sql.Connection;
import java.util.ArrayList;

import project.model.dao.TodoListDao;
import project.model.vo.TodoList;

public class TodoListService {
	
	public ArrayList<TodoList> listView(){
		
		Connection conn = getConnection();
		
		ArrayList<TodoList> list = new TodoListDao().listView(conn);
		
		close(conn);
		
		return list;
	}
	
	
	
	public int addList(String todo) {
		
		Connection conn = getConnection();
		
		int result = new TodoListDao().addList(todo, conn);
		
		close(conn);
		
		return result;
	}
	
	
	
	public int deleteList(int delete) {
		
		Connection conn = getConnection();
		
		int result = new TodoListDao().deleteList(delete, conn);
		
		close(conn);
		
		return result;
	}
	
	
	
	public int updateList(int update, String todo) {
		
		Connection conn = getConnection();
		
		int result = new TodoListDao().updateList(update, todo, conn);
		
		close(conn);
		
		return result;
	}
	
	
	
	public int checkList(int update, String check) {
		
		Connection conn = getConnection();
		
		int result = new TodoListDao().checkList(update, check, conn);
		
		close(conn);
		
		return result;
	}
	
	
	
	public ArrayList<TodoList> searchList(String keyword){
		
		Connection conn = getConnection();
		
		ArrayList<TodoList> list = new TodoListDao().searchList(keyword, conn);
		
		close(conn);
		
		return list;
	}
}
