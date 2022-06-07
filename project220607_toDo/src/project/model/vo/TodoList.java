package project.model.vo;

public class TodoList {
	
//	Field
	private int todoNum;
	private String todoList;
	private String todoCheck;
	
	
//	Constructor
	public TodoList(int todoNum, String todoList, String todoCheck) {
		super();
		this.todoNum = todoNum;
		this.todoList = todoList;
		this.todoCheck = todoCheck;
	}

	
//	Method
	public int getTodoNum() {
		return todoNum;
	}


	public void setTodoNum(int todoNum) {
		this.todoNum = todoNum;
	}


	public String getTodoList() {
		return todoList;
	}


	public void setTodoList(String todoList) {
		this.todoList = todoList;
	}


	public String getTodoCheck() {
		return todoCheck;
	}


	public void setTodoCheck(String todoCheck) {
		this.todoCheck = todoCheck;
	}


	@Override
	public String toString() {
		return todoNum + ". " + todoList + " " + todoCheck;
	}
}