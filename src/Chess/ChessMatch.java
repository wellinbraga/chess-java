package Chess;

import Chess.pieces.King;
import Chess.pieces.Rook;
import boardgame.Board;
import boardgame.Position;

public class ChessMatch {
	private Board board;
	
	private int turn;
	private Color currentPlayer;
	private boolean check;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i <board.getColumns(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('h', 6, new King(board, Color.WHITE));
		placeNewPiece('a', 8, new Rook(board, Color.WHITE));
		
	}
}
