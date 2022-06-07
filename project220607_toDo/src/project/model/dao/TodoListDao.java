package project.model.dao;

import static project.common.JDBCtemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import project.model.vo.TodoList;

public class TodoListDao {
	
	public ArrayList<TodoList> listView(Connection conn){
		
		ArrayList<TodoList> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM TODOLIST";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new TodoList(rset.getInt("todo_num")
									, rset.getString("todo_list")
									, rset.getString("todo_check")
									));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}
	
	
	
	public int addList(String todo, Connection conn) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "INSERT INTO TODOLIST VALUES(SEQ_TODO.NEXTVAL, ?, DEFAULT)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, todo);
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				commit(conn);
			}else{
				rollback(conn);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	
	
	public int deleteList(int delete, Connection conn) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "DELETE FROM TODOLIST WHERE TODO_NUM = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, delete);
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				commit(conn);
			}else{
				rollback(conn);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	
	
	public int updateList(int update, String todo, Connection conn) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE TODOLIST SET TODO_LIST = ? WHERE TODO_NUM = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, todo);
			pstmt.setInt(2, update);
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				commit(conn);
			}else{
				rollback(conn);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	
	
	public int checkList(int update, String check, Connection conn) {
		
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE TODOLIST SET TODO_CHECK = ? WHERE TODO_NUM = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, check);
			pstmt.setInt(2, update);
			result = pstmt.executeUpdate();
			
			if(result > 0) {
				commit(conn);
			}else{
				rollback(conn);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	
	
	public ArrayList<TodoList> searchList(String keyword, Connection conn){
		
		ArrayList<TodoList> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM TODOLIST WHERE TODO_LIST LIKE '%' || ? || '%'";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, keyword);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				list.add(new TodoList(rset.getInt("todo_num")
									, rset.getString("todo_list")
									, rset.getString("todo_check")
									));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
