package model;

public class Board {
//	Field
	private String[] board = new String[8];	//게임보드판

	public Board(String[] board) {
		super();
		this.board = board;
	}

	public String[] getBoard() {
		return board;
	}

	public void setBoard(String[] board) {
		this.board = board;
	}

	
//	배열에 담긴 문자열을 3X3형식으로 출력합니다.
	@Override
	public String toString() {
		return "\n" + board[0] + board[1] + board[2] + "\n"
				+ board[3] + board[4] + board[5] + "\n"
				+ board[6] + board[7] + board[8] + "\n";
	}
}