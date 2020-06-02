package Boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		//position = null; this is optional
	}
	
	protected Board getBoard() {
		return board;
	}
	
	
	
}
