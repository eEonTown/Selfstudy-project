package model;

public class User {
//	Field
	private String userName;	//유저의 이름
	private int win;			// 승리 수
	private int lose;			//패배 수
	private int draw;			//무승부 수
	private String rating;		// 유저의 등급
	
	
	
//	Constructor
	public User(){
		
	}
	
	public User(String userName, int win, int lose, int draw, String rating) {
		this.userName = userName;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
		this.rating = rating;
	}

	
	
//	Getter/Setter
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	
	
//	유저의 정보를 출력합니다.
	@Override
	public String toString() {
		return "현재 " + userName + "님의 전적 : " + rating + "계급 (" + win + "승 " + draw + "무 " + lose + "패)";
	}
}
