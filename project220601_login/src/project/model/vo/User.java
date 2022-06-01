package project.model.vo;

public class User {
	
	private int userNo;
	private String userId;
	private String userPwd;
	
	
	
	public User() {
		
	}
	
	public User(int userNo, String userId, String userPwd) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
	}

	
	
	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
}