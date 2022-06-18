package Chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private int moveCont;
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
