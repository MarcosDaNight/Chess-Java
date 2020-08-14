package Boardgame;

public abstract class Piece {

    protected Position position;
    private Board board;


    public Piece(Board board) {
        this.board = board;
        position = null; //this is optional
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];

    }

    /**
     * This method is used to check the possible movements of the part
     * returning a @return returning a Boolean type in an 8x8 matrix
     */
    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
