package model;

public class Board {
//	Field
	private String[] board = new String[8];	//���Ӻ�����

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

	
//	�迭�� ��� ���ڿ��� 3X3�������� ����մϴ�.
	@Override
	public String toString() {
		return "\n" + board[0] + board[1] + board[2] + "\n"
				+ board[3] + board[4] + board[5] + "\n"
				+ board[6] + board[7] + board[8] + "\n";
	}
}