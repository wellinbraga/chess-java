package application;

import Chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		// no ChessMatch define o Boar 8 por 8 
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
	}

}
