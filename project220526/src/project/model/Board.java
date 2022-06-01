package project.model;

import java.util.Arrays;

public class Board {
//	Field
	private String[] board = new String[8];
	{
		for(int i = 0; i < board.length; i++) {
			board[i] = "бр";
		}
	}
	

	
//	Getter / Setter
	public String[] getBoard() {
		return board;
	}

	public void setBoard(String[] board) {
		this.board = board;
	}

	
	
//	toString
	@Override
	public String toString() {
		return "\n" + board[0] + " " + board[1] + " " + board[2] + "\n"
				+ board[3] + " " + board[4] + " " + board[5] + "\n"
				+ board[6] + " " + board[7] + " asdasdasdasdsd" + board[8] + "\n";
	}
	
	
	
	
	
}