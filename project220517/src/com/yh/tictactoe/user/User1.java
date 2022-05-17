package com.yh.tictactoe.user;

public class User1 {
	
//	Field
	private String userName;
	private int win;
	private int lose;
	private int draw;
	private String rating;
	
	
	
//	Constructor
	public User1(){
		
	}
	
	public User1(String userName, int win, int lose, int draw, String rating) {
		this.userName = userName;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
		this.rating = rating;
	}

	
	
//	getter/setter
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

	
	
//	������ ��ü�� ����ϴ� �޼ҵ�
	@Override
	public String toString() {
		return "���� " + userName + "���� ���� : " + rating + "��� (" + win + "�� " + draw + "�� " + lose + "��)";
	}
}