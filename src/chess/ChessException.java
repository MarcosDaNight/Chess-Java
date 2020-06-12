package chess;

import Boardgame.BoardException;

public class ChessException extends BoardException {
	private static final long serialVErsionUID = 1L;
	
	public ChessException(String msg){
		super(msg);
	}
}
